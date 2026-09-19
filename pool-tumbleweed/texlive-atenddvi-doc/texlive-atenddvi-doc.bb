SUMMARY = "Documentation for texlive-atenddvi"
DESCRIPTION = "This package includes the documentation for texlive-atenddvi"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn78101"

RPM_NAME = "texlive-atenddvi-doc-2026.226.1.5svn78101-60.2.noarch.rpm"
RPM_HASH = "fe053ef2b5f14b3d8f5762e81c925fc87070b77b019adebe57382b1dcc56ed7dbda8accf4fb12d9c5777d6881ddf80eb88d07bdac35aa5de42ca10fb9ce01481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atenddvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
