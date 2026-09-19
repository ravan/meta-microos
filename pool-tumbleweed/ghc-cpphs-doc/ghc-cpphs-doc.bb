SUMMARY = "Haskell cpphs library documentation"
DESCRIPTION = "This package provides the Haskell cpphs library documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.10"

RPM_NAME = "ghc-cpphs-doc-1.20.10-1.11.noarch.rpm"
RPM_HASH = "d6545c63f52de918094d70ee32da92aca0dadbe91e6265984508678ad0ea692ae574a5b69ed75a112830e4b896c2e6e4e956af414f384e4ce63b7120c3a9a13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cpphs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
