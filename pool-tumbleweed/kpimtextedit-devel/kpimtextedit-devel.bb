SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kpimtextedit-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9eb94513076ab082c89434df6e6314a651c6abb89e4a15469b88a6965b20fa8ef7665cb65b1a240d611b6520026a950c491d031bbd483da02549d7f323e4f1c2"

RPROVIDES:${PN} += "cmake-KPim6TextEdit \
kpimtextedit-devel"

RDEPENDS:${PN} += "cmake-KF6Sonnet \
cmake-KF6TextCustomEditor \
cmake-KF6TextEditTextToSpeech \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libKPim6TextEdit6"

inherit rpm
