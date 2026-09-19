SUMMARY = "Development files for the ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libantlr4-runtime-devel-4.13.0-7.5.aarch64.rpm"
RPM_HASH = "3e53f3d2cbb9e6e2b8485ad90a8a251460ca0f87ef2afa093c15ef264387e0c07490d22136daafe1b96cc7780345738369ef2f1d4b7d378c10d127bf71a8636b"

RPROVIDES:${PN} += "cmake-antlr4-generator \
cmake-antlr4-runtime \
libantlr4-runtime-devel"

RDEPENDS:${PN} += "libantlr4-runtime4-13-0 \
utfcpp-devel"

inherit rpm
