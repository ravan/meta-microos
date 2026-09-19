SUMMARY = "Development files for the Turbo text editor"
DESCRIPTION = "Contains the headers and CMake files for the Turbo text \
editor, based on the Scintilla code editing component \
and the Turbo Vision 2.0 application framework."
LICENSE = "MIT"

PV = "1715766145.697580e"

RPM_NAME = "turbo-devel-1715766145.697580e-1.9.aarch64.rpm"
RPM_HASH = "c1efefa652e99f3751f9483abb5868804594213b1c0e844ba5c767a97455a4ea40304c99279bc4db74beda84cbf2292625a768e97a3b44bf29b6715b568fa8d5"

RPROVIDES:${PN} += "cmake-turbo \
turbo-devel"

RDEPENDS:${PN} += ""

inherit rpm
