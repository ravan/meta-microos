SUMMARY = "Documentation for texlive-mparrows"
DESCRIPTION = "This package includes the documentation for texlive-mparrows"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.1svn39729"

RPM_NAME = "texlive-mparrows-doc-2026.226.0.0.1svn39729-61.2.noarch.rpm"
RPM_HASH = "a0793ed5e88f010123b287c9da7c35778392a448eb9ce6f27459ac6f96faf1993542e2bc617e71d04a9dce61c895a57ce12c109ceb79c4635578ce3b7bfdf7b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
