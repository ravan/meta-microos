SUMMARY = "FastCGI PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-fastcgi-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "4971dad5a47ba2505102f16ee3fb6122a9fa3608cb5a487f0bd2a160a0a7c953b7b4d3d5d50c4fb520eaf577ffec9c83585f2257fad9d3fe86c21af9ea61422d"

RPROVIDES:${PN} += "config-php8-fastcgi \
php-cgi \
php-fastcgi \
php-sapi \
php8-fastcgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
liburiparser.so.1 \
libxml2.so.16 \
php"

inherit rpm
