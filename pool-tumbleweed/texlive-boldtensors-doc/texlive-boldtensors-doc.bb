SUMMARY = "Documentation for texlive-boldtensors"
DESCRIPTION = "This package includes the documentation for texlive-boldtensors"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-boldtensors-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "12b6dab202a2a0e8034898dea1e21629ef91a7aeaccae7622ff96b6e8f5ef14b1e16ba1928752101e562e9f109b47de1eee5ad82bad606431f05d90221e52b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boldtensors-doc"

RDEPENDS:${PN} += ""

inherit rpm
