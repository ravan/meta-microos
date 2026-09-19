SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "clang19-doc-19.1.7-14.3.noarch.rpm"
RPM_HASH = "8d6926295b858c831cdcd5ed0ec989797c55929046b28ecc560e3a49410423b64465da0939c48023b95f3119fcfd573119a29aca877bba4756553f75e204db1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang19-doc"

RDEPENDS:${PN} += ""

inherit rpm
