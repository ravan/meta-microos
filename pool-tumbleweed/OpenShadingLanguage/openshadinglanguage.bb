SUMMARY = "A language for programmable shading"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains the standalone oslc compiler and some \
utilities."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "OpenShadingLanguage-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "e2d4d28247ddaebe2bec09d574be0e0e08e41df4af986c87891c306467daea8d932df535ee0702ddff353a54fa2aaaf8bb88f78d1a0a614654fd36a9b8f71332"

RPROVIDES:${PN} += "OpenShadingLanguage"

RDEPENDS:${PN} += "OpenShadingLanguage-common-headers \
ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.3.1 \
libOpenImageIO.so.3.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboslcomp.so.1.15 \
liboslexec.so.1.15 \
liboslquery.so.1.15 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
