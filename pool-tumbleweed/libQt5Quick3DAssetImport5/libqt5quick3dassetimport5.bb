SUMMARY = "Qt5 Quick3D Asset Importing Library"
DESCRIPTION = "Qt Quick 3D Library for importing of 3D assets."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde1"

RPM_NAME = "libQt5Quick3DAssetImport5-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "884be2e3bd10535f32597945c43dbd6da731d96011473d6ffc8e02fd7ff9dce156f7ef9d093d4e9c44aadfd49d7a71abd8de98fa0f9de764b5b68b86b5707332"

RPROVIDES:${PN} += "libQt5Quick3DAssetImport.so.5 \
libQt5Quick3DAssetImport5 \
libassimp.so \
libuip.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick3DUtils.so.5 \
libassimp.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
