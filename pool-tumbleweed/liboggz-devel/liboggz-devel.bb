SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "liboggz-devel-1.1.3-2.4.aarch64.rpm"
RPM_HASH = "799e929390a82d50fc242b14d7c97e25de08ba357d8f715a0575f9e4b6296825c829d2f1de1d4f08176392aaedccb729f8d50296da334412350f95aa8e029916"

RPROVIDES:${PN} += "liboggz-devel \
pkgconfig-oggz"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboggz2 \
pkgconfig-ogg"

inherit rpm
