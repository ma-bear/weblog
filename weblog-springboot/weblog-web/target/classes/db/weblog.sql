/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80100
 Source Host           : localhost:3306
 Source Schema         : weblog

 Target Server Type    : MySQL
 Target Server Version : 80100
 File Encoding         : 65001

 Date: 05/09/2024 10:56:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `title` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '文章标题',
  `cover` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '文章封面',
  `summary` varchar(160) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '文章摘要',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
  `is_deleted` tinyint NOT NULL DEFAULT 0 COMMENT '删除标志位：0：未删除 1：已删除',
  `read_num` int UNSIGNED NOT NULL DEFAULT 1 COMMENT '被阅读次数',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_create_time`(`create_time` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_article_category_rel
-- ----------------------------
DROP TABLE IF EXISTS `t_article_category_rel`;
CREATE TABLE `t_article_category_rel`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `article_id` bigint UNSIGNED NOT NULL COMMENT '文章id',
  `category_id` bigint UNSIGNED NOT NULL COMMENT '分类id',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uni_article_id`(`article_id` ASC) USING BTREE,
  INDEX `idx_category_id`(`category_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章所属分类关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_article_content
-- ----------------------------
DROP TABLE IF EXISTS `t_article_content`;
CREATE TABLE `t_article_content`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '文章内容id',
  `article_id` bigint NOT NULL COMMENT '文章id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '教程正文',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_article_id`(`article_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章内容表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_article_tag_rel
-- ----------------------------
DROP TABLE IF EXISTS `t_article_tag_rel`;
CREATE TABLE `t_article_tag_rel`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `article_id` bigint UNSIGNED NOT NULL COMMENT '文章id',
  `tag_id` bigint UNSIGNED NOT NULL COMMENT '标签id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_article_id`(`article_id` ASC) USING BTREE,
  INDEX `idx_tag_id`(`tag_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章对应标签关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_blog_settings
-- ----------------------------
DROP TABLE IF EXISTS `t_blog_settings`;
CREATE TABLE `t_blog_settings`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `logo` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '博客Logo',
  `name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '博客名称',
  `author` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '作者名',
  `introduction` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '介绍语',
  `avatar` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '作者头像',
  `github_homepage` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT 'GitHub 主页访问地址',
  `csdn_homepage` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT 'CSDN 主页访问地址',
  `gitee_homepage` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT 'Gitee 主页访问地址',
  `zhihu_homepage` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '知乎主页访问地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '博客设置表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_category
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '分类id',
  `name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '分类名称',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
  `is_deleted` tinyint NOT NULL DEFAULT 0 COMMENT '逻辑删除标志位：0：未删除 1：已删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_name`(`name` ASC) USING BTREE,
  INDEX `idx_create_time`(`create_time` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章分类表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_statistics_article_pv
-- ----------------------------
DROP TABLE IF EXISTS `t_statistics_article_pv`;
CREATE TABLE `t_statistics_article_pv`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `pv_date` date NOT NULL COMMENT '被统计的日期',
  `pv_count` bigint UNSIGNED NOT NULL COMMENT 'pv访问量',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_pv_date`(`pv_date` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '统计表 - 文章 PV (访问量)' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE `t_tag`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '标签id',
  `name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '标签名称',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
  `is_deleted` tinyint NOT NULL DEFAULT 0 COMMENT '逻辑删除标志位：0：未删除 1：已删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_name`(`name` ASC) USING BTREE,
  INDEX `idx_create_time`(`create_time` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章标签表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` tinyint NOT NULL DEFAULT 0 COMMENT '逻辑删除：0：未删除 1：已删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_username`(`username` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `role` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_username`(`username` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户角色表' ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;

-- Weblog 所需的初始化数据，如登录用户、用户角色、博客设置信息
INSERT INTO `weblog`.`t_user` (`id`, `username`, `password`) VALUES (1, 'admin', '$2a$10$hxxHGc2Bqz9KD4S24.N59O37kaaGRFEuP5WknZENdIsnLr9R1EiOq');
INSERT INTO `weblog`.`t_user` (`id`, `username`, `password`) VALUES (2, 'test', '$2a$10$L6ce4rQsyJ1k7ZCOfN6X4e5dHLyvg2X0t9JFEZBezDq0lds79Pxja');
INSERT INTO `weblog`.`t_user_role` (`id`, `username`, `role`) VALUES (1, 'admin', 'ROLE_ADMIN');
INSERT INTO `weblog`.`t_user_role` (`id`, `username`, `role`) VALUES (2, 'test', 'ROLE_VISITOR');
INSERT INTO `weblog`.`t_blog_settings` (`id`, `logo`, `name`, `author`, `introduction`, `avatar`, `github_homepage`) VALUES (1, 'https://img.quanxiaoha.com/quanxiaoha/f97361c0429d4bb1bc276ab835843065.jpg', '大大怪的博客', '大大怪', '平安喜乐', 'https://img.quanxiaoha.com/quanxiaoha/f97361c0429d4bb1bc276ab835843065.jpg', 'https://github.com/xqboot?tab=repositories');
