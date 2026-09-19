SUMMARY = "Documentation for texlive-marginnote"
DESCRIPTION = "This package includes the documentation for texlive-marginnote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4dsvn77682"

RPM_NAME = "texlive-marginnote-doc-2026.226.1.4dsvn77682-59.2.noarch.rpm"
RPM_HASH = "9b725c6d072e0bb42c3f1e0bda9637a5ef1168e20a63ae5afc75bc911cea7703811cacda2bbcfcad26708a46d8ec2cce54a7dcd7f1610ec0d6a05cef8c61ee5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
