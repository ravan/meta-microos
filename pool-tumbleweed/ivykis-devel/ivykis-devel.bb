SUMMARY = "Development files for libivykis, an event dispatching library"
DESCRIPTION = "libivykis is a wrapper over various OS'es implementation of I/O \
readiness notification facilities (such as poll(2), kqueue(2)) and \
can be used for writing portable network servers. \
 \
This package contains the header files and development symlinks."
LICENSE = "LGPL-2.1-only"

PV = "0.43.2"

RPM_NAME = "ivykis-devel-0.43.2-1.5.aarch64.rpm"
RPM_HASH = "79a63be01ae85637f4913048c7eb7cc2b9f7c626463612d34acf9d817f416d26862f5ba3f1ab5b30ec6a994d569c0f70e1794092e2ea77c627bbe1b85720872c"

RPROVIDES:${PN} += "ivykis-devel \
pkgconfig-ivykis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libivykis0"

inherit rpm
