SUMMARY = "Development files for yascreen"
DESCRIPTION = "This package contains the header files and libraries needed to \
compile applications or shared objects that use yascreen."
LICENSE = "LGPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "yascreen-devel-2.11-1.3.aarch64.rpm"
RPM_HASH = "dc8307d4e5e5b16fba5b8eb6efc200e4130b13558fd8ea9e98a7337a684224447f923e6e1e7acfc8bc42b5be7259c888eb7bbd1748de16d00530a24534e1a2ad"

RPROVIDES:${PN} += "pkgconfig-yascreen \
yascreen-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyascreen0"

inherit rpm
