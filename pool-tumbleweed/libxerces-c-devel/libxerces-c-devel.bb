SUMMARY = "A validating XML parser - Development Files"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. \
 \
This package includes files needed for development with Xerces-c"
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "libxerces-c-devel-3.3.0-1.9.aarch64.rpm"
RPM_HASH = "99ab261ea2c512c61f8d571a984db2c492daec7ce070ca8612052f770ac434dec545b72efe5f5f0ef6ce289cf1d4a27398896ea082d12d6344d00e4f722f9a36"

RPROVIDES:${PN} += "Xerces-c-devel \
libXerces-c-devel \
libxerces-c-devel \
pkgconfig-xerces-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxerces-c-3-3"

inherit rpm
