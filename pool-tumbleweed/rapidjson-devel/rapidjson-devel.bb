SUMMARY = "Header files for rapidjson, a JSON parser and generator for C++"
DESCRIPTION = "RapidJSON is a header-only JSON parser and generator for C++. \
This package contains development headers and examples."
LICENSE = "MIT"

PV = "1.1.0+git20211015.4d6cb081"

RPM_NAME = "rapidjson-devel-1.1.0+git20211015.4d6cb081-2.4.aarch64.rpm"
RPM_HASH = "be3ccc36496babcdb3313a6b339fab9abc6ed2b74583b021c7d719146cb181a4d21eb5d0e40ab81c30f69b6d9dd47cc22ec0049f6739f9b77e211909b8fcd637"

RPROVIDES:${PN} += "cmake-RapidJSON \
pkgconfig-RapidJSON \
rapidjson \
rapidjson-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
