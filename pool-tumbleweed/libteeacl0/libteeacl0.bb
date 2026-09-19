SUMMARY = "ACL helper library"
DESCRIPTION = "Helper library libteeacl containing functions that can be used to \
generate the hashed UUID of the user or group. These can then be \
configured to PKCS11 tokens provided by libckteec for Access Control \
List (ACL) based access."
LICENSE = "BSD-2-Clause"

PV = "4.6.0"

RPM_NAME = "libteeacl0-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "bf2b4fc99f942d6b90d5fffca7c31d109e2c91080d2ca7cfba5f7e23a12b19256cb5919f5f3798c6022077486b3c170d119f2aa8ba8601029769290b8d045666"

RPROVIDES:${PN} += "libteeacl.so.0 \
libteeacl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
