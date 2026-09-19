SUMMARY = "CMake documentation for offline reading - qhelp version"
DESCRIPTION = "CMake documentation for offline reading - qhelp version."
LICENSE = "BSD-3-Clause"

PV = "4.4.3"

RPM_NAME = "cmake-doc-qhelp-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "f1e6d56a8fe14f1f318706b3ccd14bb46ff9152c5cdc6da869411e5997f441bbf0a85d1c8edb5aa22057ed5465493210dfbda03e227b9c9ba420bd24e7c1969d"

RPROVIDES:${PN} += "cmake-doc-qhelp"

RDEPENDS:${PN} += ""

inherit rpm
