SUMMARY = "OpenPGP implementation fully compliant with RFC 4880"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.18.1"

RPM_NAME = "rnp-0.18.1-5.1.aarch64.rpm"
RPM_HASH = "6d7a3423d57b67f2e79202dda4a302ec3c5f4e6180688d3cb15a4f418a6ac5287e075151f743fb53cb126ad89e95d65a6674c9d68528d4f774f344a0d826e10c"

RPROVIDES:${PN} += "rnp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
librnp.so.0 \
libstdc++.so.6"

inherit rpm
