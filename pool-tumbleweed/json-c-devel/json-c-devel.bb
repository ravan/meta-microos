SUMMARY = "Development headers and libraries for json-c"
DESCRIPTION = "JSON-C implements a reference counting object model that allows you to \
easily construct JSON objects in C, output them as JSON formatted \
strings and parse JSON formatted strings back into the C \
representation of JSON objects. \
 \
This package includes header files and scripts needed for developers \
using the json-c library"
LICENSE = "MIT"

PV = "0.19"

RPM_NAME = "json-c-devel-0.19-1.2.aarch64.rpm"
RPM_HASH = "e67e3a7e78a6fc3ac6d389850183c988ae76e3a36915669df2366ad034507084e359ee3fec0f13bc237ea835bd9b9d5caf87ed29a13e93dcffdba06c9e639341"

RPROVIDES:${PN} += "cmake-json-c \
json-c-devel \
libjson-c-devel \
libjson-devel \
pkgconfig-json \
pkgconfig-json-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjson-c5"

inherit rpm
