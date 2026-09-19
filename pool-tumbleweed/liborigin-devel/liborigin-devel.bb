SUMMARY = "Libraries and header files for liborigin"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that read OriginLab OPJ project files."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.3"

RPM_NAME = "liborigin-devel-3.0.3-1.5.aarch64.rpm"
RPM_HASH = "9c46e9bf177eb4460a8f4edd1baa8551f712e344ddf0c80a4109d1f5fcd6176d2f54622f9c3b1254aa4d2fc29ca008047bbd9d5e32ca34a7db74ec2a8c2b6ba3"

RPROVIDES:${PN} += "liborigin-devel \
pkgconfig-liborigin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborigin3"

inherit rpm
