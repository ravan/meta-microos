SUMMARY = "A Lexical Analyzer Generator for Java"
DESCRIPTION = "JLex is a lexical analyzer generator for Java."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "jlex-1.2.6-284.9.noarch.rpm"
RPM_HASH = "911da025ccc401dfc0e89d11f46d7dfa29299fd4a833daf3347efbfe1585a6a44c0a4c94dd26122d0a5621e84c50631ff55a1e4865046293a738f63aef34ed52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlex"

RDEPENDS:${PN} += ""

inherit rpm
