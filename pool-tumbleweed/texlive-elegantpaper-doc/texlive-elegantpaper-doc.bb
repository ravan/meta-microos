SUMMARY = "Documentation for texlive-elegantpaper"
DESCRIPTION = "This package includes the documentation for texlive-elegantpaper"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn78191"

RPM_NAME = "texlive-elegantpaper-doc-2026.226.0.0.12svn78191-61.4.noarch.rpm"
RPM_HASH = "1e51fc4031361fc20bc2b132c7f063cae98cf8f431698346af79ec40413db817add647be62a32964a7718b0a0cbff51ff4f4fe432b81135481f59a40cd74fcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elegantpaper-doc-zh \
texlive-elegantpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
