SUMMARY = "Documentation for texlive-prettytok"
DESCRIPTION = "This package includes the documentation for texlive-prettytok"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn76924"

RPM_NAME = "texlive-prettytok-doc-2026.226.0.0.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "dbb1c4e1321c63c1521a612562972937cc385eeedd413a55871f2470083ca62ab7b055fd19719bb9587013328bc3fcba75185bff1918616c10b85087be1809ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prettytok-doc"

RDEPENDS:${PN} += ""

inherit rpm
