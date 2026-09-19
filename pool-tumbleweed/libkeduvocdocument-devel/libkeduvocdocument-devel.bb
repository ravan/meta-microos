SUMMARY = "Library for KDE Education Applications: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE education applications."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkeduvocdocument-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ac4b180c58b81a5b091319eccb71e8b1b701352b41734dd7f5ff7238a0faa7dd515d34ab38bbc8b009fee59b75d1f295ee5205cb2c1760cc5d2c531ae921dcf0"

RPROVIDES:${PN} += "cmake-LibKEduVocDocument \
libkeduvocdocument-devel"

RDEPENDS:${PN} += "libKEduVocDocument5"

inherit rpm
