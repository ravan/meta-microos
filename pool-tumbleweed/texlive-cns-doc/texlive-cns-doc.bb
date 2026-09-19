SUMMARY = "Documentation for texlive-cns"
DESCRIPTION = "This package includes the documentation for texlive-cns"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.2.0svn45677"

RPM_NAME = "texlive-cns-doc-2026.226.4.2.0svn45677-60.2.noarch.rpm"
RPM_HASH = "eadc407e26688f06717189c163d9ceaef179c51091ea5731b19e37484f3597a510c5ec6907317d150b0b3ff5291055f5516a5da9a290caf11e55ee74fe11ffb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cns-doc"

RDEPENDS:${PN} += ""

inherit rpm
