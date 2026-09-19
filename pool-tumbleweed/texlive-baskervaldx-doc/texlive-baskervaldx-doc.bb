SUMMARY = "Documentation for texlive-baskervaldx"
DESCRIPTION = "This package includes the documentation for texlive-baskervaldx"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.08svn73362"

RPM_NAME = "texlive-baskervaldx-doc-2026.226.1.08svn73362-60.2.noarch.rpm"
RPM_HASH = "0c89d740037941e9cca6f3c2664bbdab1f86293cdcb1e67e7b8229ed32e5a6c2a431f98753f8299c91f2f55bcddf3230be525f27f05ca6602bfbff3b4e52b104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervaldx-doc"

RDEPENDS:${PN} += ""

inherit rpm
