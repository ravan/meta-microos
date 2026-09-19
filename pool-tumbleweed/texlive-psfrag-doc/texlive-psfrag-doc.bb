SUMMARY = "Documentation for texlive-psfrag"
DESCRIPTION = "This package includes the documentation for texlive-psfrag"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.04svn15878"

RPM_NAME = "texlive-psfrag-doc-2026.226.3.04svn15878-59.2.noarch.rpm"
RPM_HASH = "25a096ded4e85345fad2d9d084c7085e1d487f53836cb97a68f0db364331a3793fb71241bf980fcf49e6b3427fafb7a0b7a64a6d4aef3914744b487df0a56ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-psfrag-doc-en \
texlive-psfrag-doc"

RDEPENDS:${PN} += ""

inherit rpm
