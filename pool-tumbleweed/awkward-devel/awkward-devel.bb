SUMMARY = "Header files for using awkward in C/C++ code"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
This package provides the header files needed to compile C/C++ codes with \
awkward."
LICENSE = "BSD-3-Clause"

PV = "53"

RPM_NAME = "awkward-devel-53-1.3.aarch64.rpm"
RPM_HASH = "d787e776bb7ee07836bc268aab969098a5868bdc9c875eda6ddbd5b1eaceb10bdcf0181e7eec29bac90dba70e4e9d8b8957d3badcaf3a8ec7dbaa068228a0558"

RPROVIDES:${PN} += "awkward-devel \
cmake-awkward-headers"

RDEPENDS:${PN} += ""

inherit rpm
