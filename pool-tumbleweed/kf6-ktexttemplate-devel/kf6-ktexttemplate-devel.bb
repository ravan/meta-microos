SUMMARY = "Development package for ktexttemplate"
DESCRIPTION = "Library to allow application developers to separate the structure of documents \
from the data they contain. \
 \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ktexttemplate-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9da7b463d0a3d7d7f301339dc14ba287b280cc5cb999a69198ba948309d23288b00ce452eff838aafe70dc272238236ba8d2c1243c853bdbeeb4a1ef00d6eead"

RPROVIDES:${PN} += "cmake-KF6TextTemplate \
kf6-ktexttemplate-devel"

RDEPENDS:${PN} += "libKF6TextTemplate6"

inherit rpm
