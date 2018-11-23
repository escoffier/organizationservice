SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `t_organizations`;
CREATE TABLE `t_organizations` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(32) DEFAULT NULL,
  `contact_name` varchar(32) DEFAULT NULL COMMENT '联系人姓名',
  `contact_email` varchar(32) DEFAULT NULL COMMENT '密码',
  `contact_phone` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;