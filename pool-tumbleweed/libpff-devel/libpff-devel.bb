SUMMARY = "Development files for libpff, a PFF/OFF file format library"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpff."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20231205"

RPM_NAME = "libpff-devel-20231205-2.30.aarch64.rpm"
RPM_HASH = "c0522f0e789397c2ca99210bc2cc2ccd29f153ff9fd0369eab99e2ffc5d3462e325a3de932d5d245bb9417264a3f435907725c8d7cade69bccdf5977620adee1"

RPROVIDES:${PN} += "libpff-devel \
pkgconfig-libpff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libpff1"

inherit rpm
