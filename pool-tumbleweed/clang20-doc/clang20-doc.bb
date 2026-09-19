SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "clang20-doc-20.1.8-8.2.noarch.rpm"
RPM_HASH = "4e911820933372ef48b5ee244699937f6397775571834922f4e5a3f03718dabe5923e836744047a858cd75d08d63f425a81efe088885b2d83d497d1c67d269a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang20-doc"

RDEPENDS:${PN} += ""

inherit rpm
