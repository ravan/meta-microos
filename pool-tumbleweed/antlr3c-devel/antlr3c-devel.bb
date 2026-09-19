SUMMARY = "C runtime for the ANTLR parsing library"
DESCRIPTION = "ANTLR, ANother Tool for Language Recognition, is a language tool that provides a \
framework for constructing recognizers, interpreters, compilers, and translators \
from grammatical descriptions containing actions in a variety of target \
languages. ANTLR provides excellent support for tree construction, tree walking, \
translation, error recovery, and error reporting. \
 \
This package contains header files and development libraries needed to \
develop programs using the antlr3c library."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "antlr3c-devel-3.4-5.9.aarch64.rpm"
RPM_HASH = "4c63665deec66112c56b612e70aa605d3ef0ed0631aff6868bb3f6f65d9d3f30d2d45fa08c7b1a9293d3fec91bcaacb43919834c8d673867c57e2fbf68d2d2c3"

RPROVIDES:${PN} += "antlr3c-devel"

RDEPENDS:${PN} += "libantlr3c3"

inherit rpm
