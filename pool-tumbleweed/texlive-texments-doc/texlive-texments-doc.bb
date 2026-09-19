SUMMARY = "Documentation for texlive-texments"
DESCRIPTION = "This package includes the documentation for texlive-texments"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2.0svn15878"

RPM_NAME = "texlive-texments-doc-2026.227.0.0.2.0svn15878-62.2.noarch.rpm"
RPM_HASH = "535b813ec0c9d5c3d45a0c04ff890a4ad1bef864c0f8563a0d0cee7b1af65caf3a61296b284d09238f865f14a1e8af46e1e8a287a788e3542096d83f2bb1afe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texments-doc"

RDEPENDS:${PN} += ""

inherit rpm
