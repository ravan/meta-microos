SUMMARY = "Documentation for texlive-kluwer"
DESCRIPTION = "This package includes the documentation for texlive-kluwer"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-kluwer-doc-2026.226.svn54074-63.2.noarch.rpm"
RPM_HASH = "2756dc50f3d813e7a8f090f2a484af68985e7cc6ed92a900cc64d48f8875363481a255001bf07e7e371120b69f88b91a2b7250295a995de836f0eaaa692932eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kluwer-doc"

RDEPENDS:${PN} += ""

inherit rpm
