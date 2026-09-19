SUMMARY = "Documentation for texlive-clicks"
DESCRIPTION = "This package includes the documentation for texlive-clicks"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.3svn73208"

RPM_NAME = "texlive-clicks-doc-2026.226.0.0.4.3svn73208-60.2.noarch.rpm"
RPM_HASH = "9e45a306c851146097a8f88ecab3bf8475701bd2ad82821c77eecf7641691036f405b0795c05db736da4db57a30c88c4f7062f636a1e7a72a51c8f040e97e9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clicks-doc"

RDEPENDS:${PN} += ""

inherit rpm
