SUMMARY = "Development files for libtranscript, a character conversion library"
DESCRIPTION = "libtranscript is a character set conversion library which allows \
great control over the conversion. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libtranscript."
LICENSE = "GPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "libtranscript-devel-0.3.4-1.7.aarch64.rpm"
RPM_HASH = "77338bf034329642e6d92fad27516080f136a17ac244d80af8d9e3ad80626f1faddd1c81425768779c019b9fe7e3f015691289206944c1d8a333040d5561dd0d"

RPROVIDES:${PN} += "libtranscript-devel \
pkgconfig-libtranscript"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtranscript1"

inherit rpm
