SUMMARY = "Documentation for texlive-optexcount"
DESCRIPTION = "This package includes the documentation for texlive-optexcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn59817"

RPM_NAME = "texlive-optexcount-doc-2026.226.1.1svn59817-61.2.noarch.rpm"
RPM_HASH = "872026b287aedc6533b61977de71902ecb2039dc58352ff3e17d4f57ed8db4da02ac630cf609e20db5a4a58645dc2684597cb39203c4fe7c16a96b1cd4690dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optexcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
