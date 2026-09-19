SUMMARY = "Documentation for texlive-othelloboard"
DESCRIPTION = "This package includes the documentation for texlive-othelloboard"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn23714"

RPM_NAME = "texlive-othelloboard-doc-2026.226.1.2svn23714-61.2.noarch.rpm"
RPM_HASH = "d7f6ff32f4037a0d2925236063377d8a7c77ae8a46e5788fe735e200c8b66e979ee12cc788c1d576a10dfcc47e308c0de4dde7e925d76e4237c8fa2c95542cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-othelloboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
