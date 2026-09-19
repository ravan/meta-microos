SUMMARY = "Emoticon to graphical emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Emoticons5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "54c005eab6ff9f38b6a7aaf281879cd55ef5997e5775c1c46fd8ca4b9f07e804a6f5f4fdf6b767171ecad637da5df80b46ce4f77b67d3f02a66ffbe42382a095"

RPROVIDES:${PN} += "libKF5Emoticons.so.5 \
libKF5Emoticons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
