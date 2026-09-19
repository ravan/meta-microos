SUMMARY = "Color Management XML tools"
DESCRIPTION = "Tools to read convert ICC profiles to and from XML files"
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "IccXML-0.9.8-2.38.aarch64.rpm"
RPM_HASH = "ba9b6a68718d52b0e4318852404651cbd801356b312c8d539e5708352dea43b68c4e7ceb404861672b767ec82e1d4bf695613cbac205cd30ec9b77fcd82aab17"

RPROVIDES:${PN} += "IccXML"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIccXML.so.2 \
libSampleICC.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
