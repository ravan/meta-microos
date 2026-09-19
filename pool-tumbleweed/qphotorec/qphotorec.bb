SUMMARY = "Graphical tool to Undelete Files"
DESCRIPTION = "QPhotoRec is a Graphical User Interface (Qt based GUI) version of PhotoRec. \
More user friendly, it recognizes the same file formats."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "qphotorec-7.2-1.11.aarch64.rpm"
RPM_HASH = "46d68b9189529474bd793949ddb1b5e42f134d01328654f80ab5ef2158c833a208b6d2d41bafd7549261ba51d7e4f3a44bbe5f24f69743b5dc84837bcff9cfce"

RPROVIDES:${PN} += "qphotorec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libext2fs.so.2 \
libgcc-s.so.1 \
libjpeg.so.8 \
libntfs-3g.so.90 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
