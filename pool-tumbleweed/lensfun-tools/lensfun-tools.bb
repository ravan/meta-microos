SUMMARY = "Tools for managing lensfun data"
DESCRIPTION = "This package contains tools to fetch lens database updates and manage lens \
adapters in lensfun."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "lensfun-tools-0.3.4-7.5.aarch64.rpm"
RPM_HASH = "5f008df3379af460d557d34fd7daa9c13e2bc38b61400d5e921eef0c437c4eaad8c00ec155baeb222431f9ba0af00f08d060686e0df2f9b6f684f0bda2770af0"

RPROVIDES:${PN} += "lensfun-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
lensfun-data \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
liblensfun.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
python3-lensfun"

inherit rpm
