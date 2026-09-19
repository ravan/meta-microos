SUMMARY = "Build environment for the KF 6 MIME libraries"
DESCRIPTION = "KMime is a library for handling mail messages and newsgroup articles. \
This package provides development files to use libKF6Mime6."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kmime-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "50c305ad762184e6014c26891b2614abbe2e750a9c84e233ba4aa78deb58aaccd4e7f6ca0e1d5d1e40a0ce3ff13dc0cbc78c95669f13f45908663e65bbeba146"

RPROVIDES:${PN} += "cmake-KF6Mime \
kf6-kmime-devel \
kmime-devel"

RDEPENDS:${PN} += "libKF6Mime6"

inherit rpm
