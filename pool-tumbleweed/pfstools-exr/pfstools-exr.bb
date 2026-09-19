SUMMARY = "EXR file import and export for PFS tools"
DESCRIPTION = "This package contains two-way conversion filters between the EXR file \
format and pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-exr-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "f0735ba1309602b1685110538788b8e03589a380259ffcdb331a26b86313663cbdc8bc38f206d9ad5415948723d5206723c5301d6ad42228f251db8c67e54c8d"

RPROVIDES:${PN} += "pfstools-exr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenEXR-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
