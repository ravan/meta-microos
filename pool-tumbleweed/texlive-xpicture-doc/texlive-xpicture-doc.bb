SUMMARY = "Documentation for texlive-xpicture"
DESCRIPTION = "This package includes the documentation for texlive-xpicture"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn28770"

RPM_NAME = "texlive-xpicture-doc-2026.226.1.2asvn28770-59.4.noarch.rpm"
RPM_HASH = "95f813cb923c1329015a7bfa4885a4fe34d42e59ba7d65043f305c364242a1e954c6f0921691880c8a0189e6f245fda0b8a09053a32c24a858f301aad9d1c7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpicture-doc"

RDEPENDS:${PN} += ""

inherit rpm
