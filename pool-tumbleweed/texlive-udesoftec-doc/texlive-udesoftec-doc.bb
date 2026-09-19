SUMMARY = "Documentation for texlive-udesoftec"
DESCRIPTION = "This package includes the documentation for texlive-udesoftec"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.1svn57866"

RPM_NAME = "texlive-udesoftec-doc-2026.226.1.7.1svn57866-60.2.noarch.rpm"
RPM_HASH = "6add46d888204c123a5b1d4b48c919ec75b30c8be814e5c6cec45d77a90888359c88b090f19e3f0cfd39fed79b264c6ae2c8a4e2cf30fa18e0932bce4f8a461f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-udesoftec-doc-de \
texlive-udesoftec-doc"

RDEPENDS:${PN} += ""

inherit rpm
