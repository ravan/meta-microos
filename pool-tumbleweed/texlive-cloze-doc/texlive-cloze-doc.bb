SUMMARY = "Documentation for texlive-cloze"
DESCRIPTION = "This package includes the documentation for texlive-cloze"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn75681"

RPM_NAME = "texlive-cloze-doc-2026.226.2.0.0svn75681-60.2.noarch.rpm"
RPM_HASH = "846e11a85b088b9baac114d5d951f5ea7c602657a156faaa8a88b98d1c3a24dd2df147161ec6c4e47dd042708488b8d160db49c95252d1348fd20241c1b344bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cloze-doc"

RDEPENDS:${PN} += ""

inherit rpm
