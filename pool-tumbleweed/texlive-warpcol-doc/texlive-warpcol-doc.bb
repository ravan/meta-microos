SUMMARY = "Documentation for texlive-warpcol"
DESCRIPTION = "This package includes the documentation for texlive-warpcol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn77682"

RPM_NAME = "texlive-warpcol-doc-2026.226.1.0csvn77682-60.2.noarch.rpm"
RPM_HASH = "ccf53d492e517fce7d1f938046220e67888c823e99f8ce28778f01931a4842f17f9293becfdd5f9ed524dd4c483c7544bc7a0a278847a66cb8b7ce7231474407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-warpcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
