SUMMARY = "A library for reading OriginLab OPJ project files"
DESCRIPTION = "A library for reading OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-3.0-or-later"

PV = "3.0.3"

RPM_NAME = "liborigin3-3.0.3-1.5.aarch64.rpm"
RPM_HASH = "0985327baeaae47c45720b7cce89ccf067c4efc90b3723977b87fcee15494a24ba2fd7e140aa128160a34b07b6a623ae36dadfe3a8b7e9d1e744de7f39565cc2"

RPROVIDES:${PN} += "liborigin.so.3 \
liborigin3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
