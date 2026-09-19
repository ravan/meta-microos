SUMMARY = "Documentation for texlive-lstfiracode"
DESCRIPTION = "This package includes the documentation for texlive-lstfiracode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn49503"

RPM_NAME = "texlive-lstfiracode-doc-2026.226.0.0.1csvn49503-59.2.noarch.rpm"
RPM_HASH = "0e8a53295f2daf9bd2ab0cd74fefe39757fe71d60cb9799d1b99ee4f71659b5af5d3b93443436864fbd67e60b0a9f3c32840fd1df0ee41ae3ebba647243b5190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstfiracode-doc"

RDEPENDS:${PN} += ""

inherit rpm
