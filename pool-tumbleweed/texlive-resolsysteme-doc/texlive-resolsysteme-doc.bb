SUMMARY = "Documentation for texlive-resolsysteme"
DESCRIPTION = "This package includes the documentation for texlive-resolsysteme"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.8svn73069"

RPM_NAME = "texlive-resolsysteme-doc-2026.226.0.0.1.8svn73069-60.4.noarch.rpm"
RPM_HASH = "04bd42f284fd0d07ab16aaaa4b032b10248270172d29deddaee7c7ed8e3d6448d32117402518f5e42bcfd87a87bfb0767e80265a2492852c2e55b8d94eac3ce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-resolsysteme-doc-fr \
texlive-resolsysteme-doc"

RDEPENDS:${PN} += ""

inherit rpm
