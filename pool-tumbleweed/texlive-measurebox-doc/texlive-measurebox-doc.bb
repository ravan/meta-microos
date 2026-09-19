SUMMARY = "Documentation for texlive-measurebox"
DESCRIPTION = "This package includes the documentation for texlive-measurebox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75139"

RPM_NAME = "texlive-measurebox-doc-2026.226.1.0svn75139-59.2.noarch.rpm"
RPM_HASH = "3e5858b77346daf288a8b51fdaefbad1ea27fff4b264d67e9684a10bd816ffe7c4801d676d2462d12886b355adffe136500387643dd08e7519044c3d0f87b47f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-measurebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
