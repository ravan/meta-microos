SUMMARY = "Application for manipulation of the Mac OS icns"
DESCRIPTION = "Utilities to convert to and from icns files using libicns: \
    1. png2icns: Tool to convert png icons to icns icons, \
    2. icns2png: Tool to convert icns icons to png, and \
    3. icontainer2icns: Tool for extracting icns files from icontainers."
LICENSE = "GPL-2.0-only"

PV = "0.8.1+git20201014"

RPM_NAME = "icns-utils-0.8.1+git20201014-1.23.aarch64.rpm"
RPM_HASH = "1f2c711617dff5ddce93a3df7976c2f9f7613ecc628b95a5078e185689aa7dad89be9d082688e6bb15b3143f8c7d5af831776e789f22f6f2b48ee6f95b718829"

RPROVIDES:${PN} += "icns-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicns.so.1 \
libpng16.so.16"

inherit rpm
