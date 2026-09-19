SUMMARY = "Build environment for kemoticons, an emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kemoticons-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "af93c1627a267d128b3913d410cf34433d8b55002c7e3a31e98160693329111819833a0de966cf768c9a6f1cb1681d3deded17df1fdfbeaa882fd5997bfd10bb"

RPROVIDES:${PN} += "cmake-KF5Emoticons \
kemoticons-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Service \
cmake-Qt5Gui \
libKF5Emoticons5"

inherit rpm
