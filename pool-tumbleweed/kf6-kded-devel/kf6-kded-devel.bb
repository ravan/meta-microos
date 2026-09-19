SUMMARY = "Central daemon of KDE workspaces: Build Environment"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kded-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4bd4ce99ca86e8e3beaad3f190ad17e4ff67770729d8d89c5675adc68ebd0c29247ae20439211cba554a63f0fe77830c75b2d903d64f595ef9e532bcbd166a8b"

RPROVIDES:${PN} += "cmake-KF6KDED \
kf6-kded-devel"

RDEPENDS:${PN} += "kf6-kded"

inherit rpm
