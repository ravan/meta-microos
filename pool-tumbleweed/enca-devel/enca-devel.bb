SUMMARY = "Header files and libraries for Enca development"
DESCRIPTION = "The enca-devel package contains the static libraries and header files \
for writing programs using the Extremely Naive Charset Analyser library, \
and its API documentation. \
 \
Install enca-devel if you are going to create applications using the Enca \
library."
LICENSE = "GPL-2.0-only"

PV = "1.19"

RPM_NAME = "enca-devel-1.19-2.14.aarch64.rpm"
RPM_HASH = "104a8b041f01142098f129e585806b4cde89f74df2da1d5cdf64a072aa8fe83457e6c17a2aff7d0dcf7d2621c84b01c84bf32ac9c66f49295ecfdcd3b555da11"

RPROVIDES:${PN} += "enca-devel \
pkgconfig-enca"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libenca0"

inherit rpm
