SUMMARY = "A library for handling UTF-8 encoded strings"
DESCRIPTION = "A C++ library for handling UTF-8 encoded strings."
LICENSE = "BSL-1.0"

PV = "4.0.8"

RPM_NAME = "utfcpp-devel-4.0.8-1.4.noarch.rpm"
RPM_HASH = "01ef6e6f270ca33d1709e37a65887ee28bd9a596ecd349d549d445929e4c1c494041b5ff6aedde6cd633f87681046c8165bb5a7574f99ecbbb53864f1744237e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-utf8cpp \
utfcpp-devel"

RDEPENDS:${PN} += ""

inherit rpm
