SUMMARY = "Development files for libhugetlbfs"
DESCRIPTION = "Devel package, header and static library, of libhugetlbfs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.9.ga83fbb2"

RPM_NAME = "libhugetlbfs-devel-2.24.9.ga83fbb2-1.3.aarch64.rpm"
RPM_HASH = "1d64147bb5198c97237872cceba004d4f411d6e69b0ef03cb45604fa0cf20defc17f33bb55d9116c300b05354c10f2c38b82fbab8fbebb54f7114eaac1620443"

RPROVIDES:${PN} += "libhugetlbfs-devel"

RDEPENDS:${PN} += "libhugetlbfs"

inherit rpm
