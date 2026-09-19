SUMMARY = "FastCGI Process Manager PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-fpm-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "dea0e9c38d832d25380f979b8a905505631b81c309af2bd1d27c2713271db293e9775d888b15a88810faafb6944c7a6c806278bde07d9adba38743237209285e"

RPROVIDES:${PN} += "config-php8-fpm \
php-fpm \
php-sapi \
php8-fpm"

RDEPENDS:${PN} += "/usr/bin/sh \
group-www \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libapparmor.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libsystemd.so.0 \
liburiparser.so.1 \
libxml2.so.16 \
php \
user-wwwrun"

inherit rpm
