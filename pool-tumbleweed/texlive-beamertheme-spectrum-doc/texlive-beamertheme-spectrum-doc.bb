SUMMARY = "Documentation for texlive-beamertheme-spectrum"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-spectrum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn77770"

RPM_NAME = "texlive-beamertheme-spectrum-doc-2026.226.0.0.6svn77770-61.2.noarch.rpm"
RPM_HASH = "9670707bf78d5a814d3a0a6095fa33af78fa6c6b417e14c24fd1afe39b2959bf991ace1e7d5e1b3c938cc8667d1804bad0ece39463b17112b6672e29260d40ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-spectrum-doc"

RDEPENDS:${PN} += ""

inherit rpm
