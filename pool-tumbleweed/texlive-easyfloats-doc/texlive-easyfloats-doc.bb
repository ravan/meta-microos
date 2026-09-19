SUMMARY = "Documentation for texlive-easyfloats"
DESCRIPTION = "This package includes the documentation for texlive-easyfloats"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn72699"

RPM_NAME = "texlive-easyfloats-doc-2026.226.1.1.0svn72699-61.4.noarch.rpm"
RPM_HASH = "753305990ebaab2150c64e61c1f0cb4cb10b528224444d8dc037946b8d2d7d1120cbc60ce94a85feed3a0b6b29d743961e8af0cde51128249b4789f2ab3e5de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfloats-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
