SUMMARY = "Development files for aria2"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
This package contains development files for its shared library."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception"

PV = "1.37.0"

RPM_NAME = "aria2-devel-1.37.0-2.2.aarch64.rpm"
RPM_HASH = "79f5756e3767db13dcc648f49ab81aca641fea213fc3711016db52cecb817825531ba8f88722aea9daf8e849fd99ac75e7839f501a15a8da01ff187a257b3857"

RPROVIDES:${PN} += "aria2-devel \
pkgconfig-libaria2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaria2-0"

inherit rpm
