SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "clang23-doc-23.1.1-1.1.noarch.rpm"
RPM_HASH = "c0b9dd66269064b6b84834ed19aea3ff2037b6eb3aaaf25f87dbf9b48d7945cce93c2a342b5f0daa3b1e747f1d69c81f12babccd35e06b7fbbd1fd6ae61661a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang23-doc"

RDEPENDS:${PN} += ""

inherit rpm
