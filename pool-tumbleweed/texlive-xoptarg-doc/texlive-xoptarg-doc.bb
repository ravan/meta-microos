SUMMARY = "Documentation for texlive-xoptarg"
DESCRIPTION = "This package includes the documentation for texlive-xoptarg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-xoptarg-doc-2026.226.1.0svn15878-59.4.noarch.rpm"
RPM_HASH = "d886e35227aa9c0da3bc685b235fc7ca80f2be534e881a6f565d819ea0e3d9639b4ff473699fb93d0389953906bb68b5bb8dded1b6260bd02b373777be60078b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xoptarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
