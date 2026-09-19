SUMMARY = "Documentation for texlive-graphicxpsd"
DESCRIPTION = "This package includes the documentation for texlive-graphicxpsd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-doc-2026.226.1.2svn57341-60.4.noarch.rpm"
RPM_HASH = "39cf7aac3fb24e44d6cb4db7dfd5d485e599a9ca6203285f79d89e439a77274bc4cebfee70e94753badbef3b84abeebe4d89cfcdf34262b29740bdb77d676711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxpsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
