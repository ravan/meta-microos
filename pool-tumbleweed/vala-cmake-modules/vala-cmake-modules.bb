SUMMARY = "Vala CMake modules"
DESCRIPTION = "This is a set of CMake modules: Translations, GSettings, and Vala \
modules."
LICENSE = "BSD-3-Clause"

PV = "3"

RPM_NAME = "vala-cmake-modules-3-1.19.aarch64.rpm"
RPM_HASH = "964881a902ef623b97f271b2061d20c83dfc5b9b74c4ec3ff7348cb0ff580fcae7b2b65545bf8f9222f5b52187d1326424ddebf5876b94e37bcbc812f90ec49a"

RPROVIDES:${PN} += "vala-cmake-modules"

RDEPENDS:${PN} += ""

inherit rpm
