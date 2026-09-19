SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "phonon-qt6-devel-4.12.0-2.8.aarch64.rpm"
RPM_HASH = "8b83badc79f2056a8645686f60de46f7acf044ecd2e6f6b97817b3dd96f294185303000a312b74abc6ddba3166860745209013184526cba6ce7749aa19b3e655"

RPROVIDES:${PN} += "cmake-Phonon4Qt6 \
cmake-Phonon4Qt6Experimental \
phonon-qt6-devel \
pkgconfig-phonon4qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Widgets \
libphonon4qt6"

inherit rpm
