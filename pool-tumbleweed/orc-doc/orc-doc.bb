SUMMARY = "The Oil Runtime Compiler Library - Documentation"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.44"

RPM_NAME = "orc-doc-0.4.44-1.1.noarch.rpm"
RPM_HASH = "4a05569c8f7196ddd31226f0050312768cf145e9c37b24f7b2e0a15029190178a49c7118c91f210f5d6aa284f61beea32d98782cd65ea09dbeb9fcd6892cc9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orc-doc"

RDEPENDS:${PN} += ""

inherit rpm
