SUMMARY = "Documentation for texlive-technics"
DESCRIPTION = "This package includes the documentation for texlive-technics"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn29349"

RPM_NAME = "texlive-technics-doc-2026.227.1.0svn29349-62.2.noarch.rpm"
RPM_HASH = "2ff6fa9bb744461e869deac818bd63f7e1d58c29d0873b01a452434b81edd001ffdacea3460e0f70e713209926b448798f220d605663fa47a335518b6e6a5fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-technics-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
