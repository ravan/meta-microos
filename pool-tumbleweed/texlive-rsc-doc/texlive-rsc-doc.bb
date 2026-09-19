SUMMARY = "Documentation for texlive-rsc"
DESCRIPTION = "This package includes the documentation for texlive-rsc"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1fsvn41923"

RPM_NAME = "texlive-rsc-doc-2026.226.3.1fsvn41923-60.2.noarch.rpm"
RPM_HASH = "387b230226873de3f619f58d325344f17d6989e98d08473cf84b94afa9c7ea2b6040f2f3aaa5c184a7048412e9e726803666113db68edebd5b10385a59bcbb95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
