CREATE TABLE `USER` (
  `USERNAME` varchar(25) DEFAULT NULL,
  `PASSWORD` varchar(25) DEFAULT NULL,
  `FIRSTNAME` varchar(25) DEFAULT NULL,
  `LASTNAME` varchar(25) DEFAULT NULL,
  `Last_Login_dt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Last_Logout_dt` timestamp NULL DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

