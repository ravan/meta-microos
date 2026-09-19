SUMMARY = "Development files for the 'memkind' user extensible heap manager"
DESCRIPTION = "Header files for building applications with libmemkind."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "memkind-devel-1.14.0-3.1.aarch64.rpm"
RPM_HASH = "6fa22a836590c001577c8072b28a44d0e599190a3d51701b09cf1e34df428a75fac1f216f3092d47f6c885f489d5260fc7689884d8b964ff4a65494986bb4ded"

RPROVIDES:${PN} += "memkind-devel \
pkgconfig-memkind"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmemkind0"

inherit rpm
