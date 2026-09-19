SUMMARY = "Embedded SAPI Library"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-embed-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "06c1db9fac878dae9deada8dbd59b76be7a56a0cb55ba9a017663faebaad9bbf420c632f1066028de1b12133245fc73fde11b52720bcdd810c6f6a3c362069b6"

RPROVIDES:${PN} += "libphp.so \
php-sapi \
php8-embed"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
liburiparser.so.1 \
libxml2.so.16 \
php"

inherit rpm
