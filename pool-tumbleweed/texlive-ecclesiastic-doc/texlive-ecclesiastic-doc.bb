SUMMARY = "Documentation for texlive-ecclesiastic"
DESCRIPTION = "This package includes the documentation for texlive-ecclesiastic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-doc-2026.226.0.0.3svn38172-61.4.noarch.rpm"
RPM_HASH = "15647c96665e12aeaa35f11c0fb3e205f4602e1925a6490ac9f5d805a8a36f7ca69ef80d35416c60dd535187d5a1057f35eb7fa2fe5affa49be78449fc250c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecclesiastic-doc"

RDEPENDS:${PN} += ""

inherit rpm
