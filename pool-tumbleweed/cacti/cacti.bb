SUMMARY = "Web Front-End to Monitor System Data via RRDtool"
DESCRIPTION = "Cacti is a complete front-end to RRDtool: it stores all necessary \
information for creating graphs and populates them with data from a \
MySQL database. The front-end is completely PHP driven. Along with \
being able to maintain graphs, data sources, and round robin archives \
in a database, Cacti also handles data gathering. There exists an SNMP \
support for those accustomed to creating traffic graphs with MRTG as \
well."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.31+git14.396480d3"

RPM_NAME = "cacti-1.2.31+git14.396480d3-1.1.noarch.rpm"
RPM_HASH = "3cc900363c553b6d888ae62d0f3f7b78d0d925d90054ebcc595508ccbb3398518d84a3af6bde9b977521f76a950656ea2cda082fac99ec782a6041ad190d15be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cacti \
cacti-PA \
cacti-system \
config-cacti"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/php \
/usr/bin/sh \
apache2 \
group-www \
logrotate \
mariadb \
mod-php-any \
net-snmp \
php-ctype \
php-gd \
php-gmp \
php-intl \
php-json \
php-ldap \
php-mbstring \
php-mysql \
php-openssl \
php-posix \
php-snmp \
php-sockets \
php-zlib \
rrdtool \
systemd \
user-wwwrun"

inherit rpm
