SUMMARY = "C library for the Publix Suffix List"
DESCRIPTION = "libpsl is a C library to handle the Public Suffix List. A 'public suffix' is a \
domain name under which Internet users can directly register own names. \
 \
HTTP user agents can use it to avoid privacy-leaking 'supercookies' and 'super \
domain' certificates. It is also use do highlight domain parts in a user interface \
and sorting domain lists by site."
LICENSE = "MIT & MPL-2.0"

PV = "0.23.3"

RPM_NAME = "libpsl5-0.23.3-1.1.aarch64.rpm"
RPM_HASH = "eaa95f8c48acb541ea1a1ae76fb804a20f358938af2973dbade2d48122ca39e32cdd79b5128b88347bf5da794e94e64ab236633cf41daebc45514caca7eccec6"

RPROVIDES:${PN} += "libpsl.so.5 \
libpsl5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
libunistring.so.5"

inherit rpm
