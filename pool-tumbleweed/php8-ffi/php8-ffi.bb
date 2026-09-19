SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-ffi-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "df0311198cde357b33848fa4ce3da442f97825dd3a5093fda2577f3a45ede540140672aa998c6e66374806cde99f00b07271361e412b89e4d98bfa28f778f8ce"

RPROVIDES:${PN} += "config-php8-ffi \
php-ffi \
php8-ffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
php"

inherit rpm
