SUMMARY = "Documentation for texlive-nddiss"
DESCRIPTION = "This package includes the documentation for texlive-nddiss"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2017.2svn45107"

RPM_NAME = "texlive-nddiss-doc-2026.226.3.2017.2svn45107-61.2.noarch.rpm"
RPM_HASH = "436910af7fba6b97a0c11cfce2758e4aeaf9c67097e09785cd09fa076e6bd69bfa3b41bff295b08663c59ac0185555bb0d5cd43e0af2f1d6ea3be1d83a905083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nddiss-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
