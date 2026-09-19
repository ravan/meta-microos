SUMMARY = "Documentation for texlive-belleek"
DESCRIPTION = "This package includes the documentation for texlive-belleek"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn66115"

RPM_NAME = "texlive-belleek-doc-2026.226.svn66115-61.2.noarch.rpm"
RPM_HASH = "64b6ec6b337eb4a1912e13e5499635fa64ac06f70500d7252768f1e84b1f0d48e09d95d59e7d5741978ed45610d6055aafb1825a0ba3a641266253139d405fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-belleek-doc"

RDEPENDS:${PN} += ""

inherit rpm
