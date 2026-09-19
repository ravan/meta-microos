SUMMARY = "Documentation for texlive-refenums"
DESCRIPTION = "This package includes the documentation for texlive-refenums"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn44131"

RPM_NAME = "texlive-refenums-doc-2026.226.1.1.2svn44131-60.4.noarch.rpm"
RPM_HASH = "33e4151f4491e2b0c0c14e3c7234d2577382264d230b232a2be2460b16835624f9313f72657ea8887f191f29dd23f676ee4828cfe91a80588326b9a364c259bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refenums-doc"

RDEPENDS:${PN} += ""

inherit rpm
