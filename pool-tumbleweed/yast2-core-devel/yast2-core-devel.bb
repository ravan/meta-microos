SUMMARY = "YaST2 - Core Libraries"
DESCRIPTION = "This package contains include and documentation files for developing \
applications using the YaST2 YCP interpreter."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.4"

RPM_NAME = "yast2-core-devel-5.0.4-1.6.aarch64.rpm"
RPM_HASH = "b04b95fcd71dc17608e0e63d9316d1c7cd6dd912ecf7184d10a60548a5ac03b1b84e444d992f4b043df91ac4ffb92cdc406c7472abcd8dde87ca4549d41db9ca"

RPROVIDES:${PN} += "liby2util-devel \
pkgconfig-yast2-core \
yast2-core-devel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/pkg-config \
glibc-devel \
libstdc++-devel \
yast2-core"

inherit rpm
