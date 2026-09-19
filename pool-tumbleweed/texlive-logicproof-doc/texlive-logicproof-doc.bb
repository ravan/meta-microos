SUMMARY = "Documentation for texlive-logicproof"
DESCRIPTION = "This package includes the documentation for texlive-logicproof"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn33254"

RPM_NAME = "texlive-logicproof-doc-2026.226.svn33254-61.2.noarch.rpm"
RPM_HASH = "68a55e0167a8a18bae4b53fe7190593fadecada6c7611ba7dab1eff644a0121e41197be0ecc58d7da677c3069c716b94d7324f19db0acc64ef1eb92b8d634646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logicproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
