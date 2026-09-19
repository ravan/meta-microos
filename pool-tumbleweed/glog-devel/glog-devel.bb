SUMMARY = "Header files for libglog2"
DESCRIPTION = "The glog library implements application-level logging. \
This library provides logging APIs based on C++-style \
streams and various helper macros. \
 \
This package provides development files for libglog2."
LICENSE = "BSD-3-Clause"

PV = "0.7.1"

RPM_NAME = "glog-devel-0.7.1-1.7.aarch64.rpm"
RPM_HASH = "de1a5c99160f2046ce2688f244baa1c53cc10fbf07f1448934f85f0773371218391e7852be3b1d09e78d3e85aff0e1016c98e3810566eb0dfb3aa97fc98b945c"

RPROVIDES:${PN} += "cmake-glog \
glog-devel \
pkgconfig-libglog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglog2"

inherit rpm
