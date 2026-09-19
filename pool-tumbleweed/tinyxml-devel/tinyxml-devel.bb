SUMMARY = "Development files for libtinyxml"
DESCRIPTION = "The libtinyxml-devel package contains libraries and header files for \
developing applications that use libtinyxml."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.2"

RPM_NAME = "tinyxml-devel-2.6.2-14.5.aarch64.rpm"
RPM_HASH = "a71a1b633a56b306a524c45794705c7439cc456729c311d3da7d59df5e28b58901f43fbdb6ebb3538eb2677ec516c2a984743fa5334bd6d1a83a18bb746d20e7"

RPROVIDES:${PN} += "libtinyxml-devel \
pkgconfig-tinyxml \
tinyxml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinyxml0"

inherit rpm
