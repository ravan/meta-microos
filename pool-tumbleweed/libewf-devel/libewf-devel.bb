SUMMARY = "Development files for libewf, an Expert Witness Compression Format library"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libewf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20240506"

RPM_NAME = "libewf-devel-20240506-2.22.aarch64.rpm"
RPM_HASH = "eead90fa3ed9efd255f82db55e4d5d425748402205db60eaf4e67654e2c482fc672a0c40bf9a62502522994f596933c875dc72db1bb41b32c8334980b7a34f30"

RPROVIDES:${PN} += "libewf-devel \
pkgconfig-libewf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libewf3"

inherit rpm
