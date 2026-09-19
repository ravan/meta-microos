SUMMARY = "Documentation for texlive-isopt"
DESCRIPTION = "This package includes the documentation for texlive-isopt"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn45509"

RPM_NAME = "texlive-isopt-doc-2026.226.0.0.01svn45509-63.2.noarch.rpm"
RPM_HASH = "ca4ab2f43c638da01585d82ef882453c0b11904467967e14d7ca3f9f0a8b5de6116f3f23cbd8a44177c27fc72bc258d064d3a1eac0657569de03783b6584a003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
