SUMMARY = "Development files for the CM computation software"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "cm-devel-0.4.4-1.7.aarch64.rpm"
RPM_HASH = "722d04b7c3c030b4265f869d5be9ddb1074fec7e34f56aee9875942d43b8311856587fd696debe663aeeabc438712247a06cd34ca31010e5eca12f562012ea8b"

RPROVIDES:${PN} += "cm-devel"

RDEPENDS:${PN} += "libcm1 \
mpc-devel \
mpfrcx-devel \
zlib-devel"

inherit rpm
