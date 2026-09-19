SUMMARY = "Documentation for texlive-hep-reference"
DESCRIPTION = "This package includes the documentation for texlive-hep-reference"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-reference-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "3d83ccfdb3a910ccd98b1effd26e6b9f1743a5e1860e62f5d6223384cf97a0a661d5f6e0babb148c43f3805fe9a90484999add7a4d83c77f821e0fb71d9684b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-reference-doc"

RDEPENDS:${PN} += ""

inherit rpm
