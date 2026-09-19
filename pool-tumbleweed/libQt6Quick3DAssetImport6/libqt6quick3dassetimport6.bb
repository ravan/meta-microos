SUMMARY = "Qt 6 Quick3DAssetImport library"
DESCRIPTION = "The Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DAssetImport6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "23cbe4083ff883b4c7a794d1d148aa38ea99c6e73c541dcd0de4f957fc37590dde1df17d95ce0ed446a24f655190368be4170540298a9f99eca7a03937a448d3"

RPROVIDES:${PN} += "libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DAssetImport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
