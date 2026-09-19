SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "clang22-doc-22.1.8-3.2.noarch.rpm"
RPM_HASH = "a4322a4b7e00e569c93cbffd20051b1a5ceea53e7c4c672ca63a8d214e350dee2b735cb2369c026a78eaaef533b7de8ffa1747577fb1acf8ea7de50d23fcd55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang22-doc"

RDEPENDS:${PN} += ""

inherit rpm
