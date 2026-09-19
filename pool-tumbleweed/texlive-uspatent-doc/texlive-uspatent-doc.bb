SUMMARY = "Documentation for texlive-uspatent"
DESCRIPTION = "This package includes the documentation for texlive-uspatent"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn27744"

RPM_NAME = "texlive-uspatent-doc-2026.226.1.0svn27744-60.2.noarch.rpm"
RPM_HASH = "a275fea902a589596d5ac823a77effae25f6e06d42e47940009206d2a0d666d5ac35e7517b1014be9cba9aaedb041255026610fd76beb11e56d5ebcbf25c66a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uspatent-doc"

RDEPENDS:${PN} += ""

inherit rpm
