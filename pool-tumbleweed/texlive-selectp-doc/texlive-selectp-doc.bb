SUMMARY = "Documentation for texlive-selectp"
DESCRIPTION = "This package includes the documentation for texlive-selectp"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-selectp-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "2b89df530ed13493c8401516cbb66657c0039b1e157cc94c5c217908703622389fb63ebee546b915ee6ab08a2c224d4e20708ca4b98bbb1ebea527e0fd2612f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selectp-doc"

RDEPENDS:${PN} += ""

inherit rpm
