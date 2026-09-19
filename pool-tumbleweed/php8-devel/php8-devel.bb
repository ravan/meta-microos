SUMMARY = "PHP development files for C/C++ extensions"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the C headers to build PHP extensions."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-devel-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "b1ba35ecfe6043fedea9be83c38306b445c7474cbb025bb23a68c8599b4e1300335a3a86b4051ef9bbb5e4fff6793de7f696c93c96c29916e4cbdf88dd022b8f"

RPROVIDES:${PN} += "php-devel \
php8-devel \
rpm-macro-pear-cfgdir \
rpm-macro-pear-datadir \
rpm-macro-pear-docdir \
rpm-macro-pear-metadir \
rpm-macro-pear-phpdir \
rpm-macro-pear-testdir \
rpm-macro-pear-wwwdir \
rpm-macro-pear-xmldir \
rpm-macro-pecl-datadir \
rpm-macro-pecl-docdir \
rpm-macro-pecl-phpdir \
rpm-macro-pecl-testdir \
rpm-macro-php-cfgdir \
rpm-macro-php-core-api \
rpm-macro-php-extdir \
rpm-macro-php-pear-gen-filelist \
rpm-macro-php-peardir \
rpm-macro-php-pearxmldir \
rpm-macro-php-version \
rpm-macro-php-zend-api"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
php \
php8-pear \
php8-pecl \
pkgconfig-capstone \
pkgconfig-libargon2 \
pkgconfig-libpcre2-8 \
pkgconfig-liburiparser \
pkgconfig-libxml-2.0 \
pkgconfig-tinfo"

inherit rpm
