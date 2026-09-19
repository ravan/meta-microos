SUMMARY = "Extended PHP debugger"
DESCRIPTION = "The Xdebug extension helps debugging scripts by providing \
debug information such as: \
 \
  * stack and function traces in error messages with: \
    o full parameter display for user defined functions \
    o function name, file name and line indications \
    o support for member functions \
  * memory allocation \
  * protection for infinite recursions \
 \
Xdebug also provides: \
 \
  * profiling information for PHP scripts \
  * code coverage analysis \
  * capabilities to debug your scripts interactively with a debug client"
LICENSE = "PHP-3.0"

PV = "3.5.3"

RPM_NAME = "php8-xdebug-3.5.3-16.3.aarch64.rpm"
RPM_HASH = "4496354c35eb0155e672000bdf97ca73843f2ecb1c70637a3f44443168c7430f478f0de86366043c7e92cc12e5aba52a7ed52dff34232ae7ebeafb4f7eb5bf78"

RPROVIDES:${PN} += "config-php8-xdebug \
php-xdebug \
php8-xdebug"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
php-api \
php-zend-abi"

inherit rpm
