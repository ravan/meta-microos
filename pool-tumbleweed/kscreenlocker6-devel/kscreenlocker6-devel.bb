SUMMARY = "Library and components for secure lock screen architecture - development files"
DESCRIPTION = "Development files for Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kscreenlocker6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0b9d3f815e87e3c9db74d72067e6f46d5a73792bb0ea3bd905aa3cde802c23764098248383c0d08cfa3226d9cf4b51a69afe312d43eee9c451d07b2dfa845d50"

RPROVIDES:${PN} += "cmake-KScreenLocker \
cmake-ScreenSaverDBusInterface \
kscreenlocker6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKScreenLocker6"

inherit rpm
