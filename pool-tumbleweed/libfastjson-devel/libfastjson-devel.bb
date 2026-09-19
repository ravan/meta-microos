SUMMARY = "Development headers and libraries for libfastjson"
DESCRIPTION = "A JSON parsing library, a fork of json-c, developed by the rsyslog team \
and used for rsyslog and liblognorm. \
 \
This package includes header files and scripts needed for developers \
using the libfastjson library"
LICENSE = "MIT"

PV = "1.2609.0"

RPM_NAME = "libfastjson-devel-1.2609.0-1.1.aarch64.rpm"
RPM_HASH = "b6d75ce7a80d25bf07415ab61db5fe585cc168e6d924ed5bb98f319e8bb2c9f20f8d5425d4f2e39e4156c5884ba0de587de735f4af0bfff618bf7096a3cb6861"

RPROVIDES:${PN} += "libfastjson-devel \
pkgconfig-libfastjson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfastjson4"

inherit rpm
