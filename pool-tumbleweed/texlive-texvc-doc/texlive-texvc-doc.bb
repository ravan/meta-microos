SUMMARY = "Documentation for texlive-texvc"
DESCRIPTION = "This package includes the documentation for texlive-texvc"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3svn76874"

RPM_NAME = "texlive-texvc-doc-2026.227.1.3svn76874-62.2.noarch.rpm"
RPM_HASH = "8a8f8f3489314cd72713fcf4a35b51aef44607892458c23c24f0602f3ce5aa106417827182d6267cb91df9592bec831f8210d6b4f463e8a750243bd70c571445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texvc-doc"

RDEPENDS:${PN} += ""

inherit rpm
