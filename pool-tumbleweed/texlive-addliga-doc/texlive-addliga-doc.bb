SUMMARY = "Documentation for texlive-addliga"
DESCRIPTION = "This package includes the documentation for texlive-addliga"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn50912"

RPM_NAME = "texlive-addliga-doc-2026.226.1.0svn50912-61.2.noarch.rpm"
RPM_HASH = "a762a871d57016e8faa046cfc4550a7a326419cb9c184a3757a87fa06df6adef5b0b27e143f80c801f13f85fb90e47818a964da199526e0ff3ba5564c03a3dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addliga-doc"

RDEPENDS:${PN} += ""

inherit rpm
