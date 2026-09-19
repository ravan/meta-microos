SUMMARY = "Documentation for texlive-xetex-devanagari"
DESCRIPTION = "This package includes the documentation for texlive-xetex-devanagari"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-doc-2026.226.0.0.5svn34296-59.4.noarch.rpm"
RPM_HASH = "cf1a23c824924639f943d2b94a2e8c7e8be994b903fa4b78327542078dc987c92220eb83713434ffae7be9507772e08c47458b66a8233876db436787740693fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-devanagari-doc"

RDEPENDS:${PN} += ""

inherit rpm
