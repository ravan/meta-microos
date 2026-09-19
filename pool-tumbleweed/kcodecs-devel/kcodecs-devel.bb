SUMMARY = "Header files for kcodecs, a method collection for string manipulation"
DESCRIPTION = "Development files for KCodecs, a method collection to manipulate \
strings using various encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kcodecs-devel-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "1cdb358e91d577f91efd1619369fabba53a30f37329f4d7f5842d055ac5208c44817cb1263e35c9a34ee21422ae69ade5043cd48a77ea9dd22178341aa674fdc"

RPROVIDES:${PN} += "cmake-KF5Codecs \
kcodecs-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5Codecs5"

inherit rpm
