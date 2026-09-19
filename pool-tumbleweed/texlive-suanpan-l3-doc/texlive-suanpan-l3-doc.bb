SUMMARY = "Documentation for texlive-suanpan-l3"
DESCRIPTION = "This package includes the documentation for texlive-suanpan-l3"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.4svn76924"

RPM_NAME = "texlive-suanpan-l3-doc-2026.226.1.2.4svn76924-64.2.noarch.rpm"
RPM_HASH = "6c06d77282f0dccaa2ed507a2c5f0217f034b2ecafab6cab368e939aad90503dd3c862de07f845fc074372f702123373819209dcbaa7a9991dcb992151962c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-suanpan-l3-doc-zh \
texlive-suanpan-l3-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
