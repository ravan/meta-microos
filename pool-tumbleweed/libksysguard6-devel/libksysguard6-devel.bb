SUMMARY = "Task management and system monitoring library -- devel files"
DESCRIPTION = "Task management and system monitoring library. This package contains development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libksysguard6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "3303b1579dcc87c7676029c2b7647faf077ccb7182efc8697576c533d33a51ea77078bed991336f2b8bbe9753551c3cf402d7696dab651d655b1d3bbd097904d"

RPROVIDES:${PN} += "cmake-KSysGuard \
libksysguard5-devel \
libksysguard6-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cmake-KF6I18n \
cmake-KF6IconThemes \
cmake-Qt6Core \
cmake-Qt6Network \
cmake-Qt6Widgets \
libKSysGuardSystemStats2 \
libksysguard6"

inherit rpm
