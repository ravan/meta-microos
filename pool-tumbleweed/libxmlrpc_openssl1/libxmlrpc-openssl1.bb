SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "This xmlrpc-c component library deals with OpenSSL 3.x's locking state."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_openssl1-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "09e8b165357d2da1d8de156b0bb2822047113f5667c9add0f32328d2880f4bb3fb691f561bc079e6932b8ee969b82baa32b696e80452dbc1cc867bfb4394811c"

RPROVIDES:${PN} += "libxmlrpc-openssl.so.1 \
libxmlrpc-openssl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libxmlrpc-util.so.4"

inherit rpm
