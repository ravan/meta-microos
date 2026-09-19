SUMMARY = "Development files for the Apache Portable Runtime (APR) library"
DESCRIPTION = "APR is Apache's Portable Runtime Library, designed to be a support \
library that provides a predictable and consistent interface to \
underlying platform-specific implementations. \
 \
This subpackage contains header files for developing applications \
that want to make use of APR."
LICENSE = "Apache-2.0"

PV = "1.7.6"

RPM_NAME = "apr-devel-1.7.6-2.2.aarch64.rpm"
RPM_HASH = "4f0e83a05c7bc8368b88263a23bc4615e50a19feea943edfb480edc4a5303328c9269db11b74bc58efe98aee28bc003507b1fef325cdab68fe08ff0706497e33"

RPROVIDES:${PN} += "apr-devel \
libapr1-devel \
pkgconfig-apr-1"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
libapr1-0"

inherit rpm
