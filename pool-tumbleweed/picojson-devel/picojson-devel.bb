SUMMARY = "Header files for picojson development"
DESCRIPTION = "PicoJSON is a tiny JSON parser / serializer for C++. It is implemented as \
header-only, has no external dependencies, is STL-friendly (using std::vector \
and std::map only), and provides both streaming (event-based) and a pull \
interface. \
This package provides the picojson header file(s)."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "picojson-devel-1.3.0-1.26.aarch64.rpm"
RPM_HASH = "c15968f763ab8d1179cb6b610a7d1fbbd3c67d6ffaac15040d1ea454ea698522a60e20f875d11fba8b130c503d7e48614c3dc2e2e58db1d72b1ecc2d1a5f2107"

RPROVIDES:${PN} += "picojson-devel \
picojson-static"

RDEPENDS:${PN} += ""

inherit rpm
