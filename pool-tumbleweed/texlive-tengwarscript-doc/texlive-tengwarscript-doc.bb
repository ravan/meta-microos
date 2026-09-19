SUMMARY = "Documentation for texlive-tengwarscript"
DESCRIPTION = "This package includes the documentation for texlive-tengwarscript"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3.1svn34594"

RPM_NAME = "texlive-tengwarscript-doc-2026.227.1.3.1svn34594-62.2.noarch.rpm"
RPM_HASH = "3b8b1cc662a98aa8adaa98aceef80a84042beea3c98a62ce7d7d8f3c56761bb75b942c19e89cd23b59926e9cdc50925e19a73a11105f786ac375aec2ff402f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tengwarscript-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
