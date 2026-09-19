SUMMARY = "Development files for log4cplus"
DESCRIPTION = "This package provides development libraries and headers needed to \
build software making use of log4cplus"
LICENSE = "Apache-2.0"

PV = "2.1.2"

RPM_NAME = "log4cplus-devel-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "030a8d2d5ea7dcda34cb21c23a4000eec09cf2341734b1f2e64d64f3286f1a6e2b4f194ad9c372c30af447759c4a6d272bd4bcccee331e3dff4071ff73742fb2"

RPROVIDES:${PN} += "log4cplus-devel \
pkgconfig-log4cplus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4cplus-2-1-9"

inherit rpm
