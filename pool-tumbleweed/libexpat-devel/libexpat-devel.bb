SUMMARY = "Development files for expat, an XML parser toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags). \
 \
This package contains the development headers for the library found \
in libexpat."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "libexpat-devel-2.8.4-1.1.aarch64.rpm"
RPM_HASH = "2ac065dcb807adc47a640c700bf3f263fb9704faae732f67e270a8cfa1f803c68631f88de60aa05ce59362f26f2b9c56eb30b3429a3f0b1d7eddb80d10c46966"

RPROVIDES:${PN} += "libexpat-devel \
pkgconfig-expat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexpat1"

inherit rpm
