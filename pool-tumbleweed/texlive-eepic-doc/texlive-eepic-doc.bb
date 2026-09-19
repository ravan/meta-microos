SUMMARY = "Documentation for texlive-eepic"
DESCRIPTION = "This package includes the documentation for texlive-eepic"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1esvn77682"

RPM_NAME = "texlive-eepic-doc-2026.226.1.1esvn77682-61.4.noarch.rpm"
RPM_HASH = "1ae83e7dfcec92547a1528c51e8f89a31ec811df8a4247c992a3bfc081bcf762c47de08cb7a35459eaacaeaa1ed40e9b0c1bca4b7957381d61015f1221ec119e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eepic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
