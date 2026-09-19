SUMMARY = "Documentation for texlive-gitstatus"
DESCRIPTION = "This package includes the documentation for texlive-gitstatus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64662"

RPM_NAME = "texlive-gitstatus-doc-2026.226.1.1svn64662-60.4.noarch.rpm"
RPM_HASH = "c9ff8af06fbf661d62214e8abbf157ac4bda9aaea2e331882f6b62136e00dbbc5d6533e0db0c6003e27cf1d2a452eea45afcd4c6c62a9f4c768266fba9db5543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitstatus-doc"

RDEPENDS:${PN} += ""

inherit rpm
