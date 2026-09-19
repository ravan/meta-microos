SUMMARY = "Development headers and libraries for cereal library"
DESCRIPTION = "cereal is a header-only C++11 serialization library. cereal takes arbitrary \
data types and reversibly turns them into different representations, such as \
compact binary encodings, XML, or JSON. cereal was designed to be fast, \
light-weight, and easy to extend - it has no external dependencies and can be \
easily bundled with other code or used standalone. \
 \
This package contains development headers and libraries for the cereal library"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "cereal-devel-1.3.2-1.15.aarch64.rpm"
RPM_HASH = "6309c0956ab06b3548db437c46adb73a6f7227db0d0b9d6f98a43c7a03affb5fcbfbab8f2943d9042c94d270909208609cfe48a0c8008ff27556b571baf099a7"

RPROVIDES:${PN} += "cereal-devel \
cmake-cereal"

RDEPENDS:${PN} += ""

inherit rpm
