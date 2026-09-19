SUMMARY = "Documentation for texlive-hep-title"
DESCRIPTION = "This package includes the documentation for texlive-hep-title"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-title-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "157197a2d86a497754f76e204110972c47c238b4beccd686f1bb9522761de67e21d1d0e68a177dbfd2883de97c64132f9a03387777b4b0af0ece66b36acc7a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-title-doc"

RDEPENDS:${PN} += ""

inherit rpm
