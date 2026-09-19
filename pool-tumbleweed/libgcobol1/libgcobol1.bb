SUMMARY = "GNU GCC COBOL compiler runtime library"
DESCRIPTION = "Runtime library for the GNU GCC COBOL language."
LICENSE = "BSD-3-Clause"

PV = "15.3.0+git11272"

RPM_NAME = "libgcobol1-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "e16ee19eaf74b893874814eeb2fc400837ad6278b8a64e907d8e049ad53dbd3892b41d89e46ddc6dbc4e9a7e3bcfee13489d9e0af0bb1f295dcbcd350a6fed3f"

RPROVIDES:${PN} += "libgcobol.so.1 \
libgcobol1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
