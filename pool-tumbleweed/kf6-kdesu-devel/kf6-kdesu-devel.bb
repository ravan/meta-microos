SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdesu-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "834c54cec8e702b445314febaf33dbc3ff17b1776865d5d4fd02c137305fffc6a1c689cac237bfb3173dc5d1fbe5bb93d7485107935d002c2ab505189a6774dd"

RPROVIDES:${PN} += "cmake-KF6Su \
kf6-kdesu-devel"

RDEPENDS:${PN} += "cmake-KF6Pty \
libKF6Su6"

inherit rpm
