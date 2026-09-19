SUMMARY = "Documentation for texlive-unimath-plain-xetex"
DESCRIPTION = "This package includes the documentation for texlive-unimath-plain-xetex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn72498"

RPM_NAME = "texlive-unimath-plain-xetex-doc-2026.226.0.0.2csvn72498-60.2.noarch.rpm"
RPM_HASH = "10f13260a28eb2015ff198bad727b9b73ac2b43be51c2ed777bc29e61728547b94e7992dc3606fe69ef48320848cef3db4b30a4a99c65a039a653b440465fecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unimath-plain-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
