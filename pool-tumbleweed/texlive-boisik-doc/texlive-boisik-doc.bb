SUMMARY = "Documentation for texlive-boisik"
DESCRIPTION = "This package includes the documentation for texlive-boisik"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-boisik-doc-2026.226.0.0.5svn15878-59.2.noarch.rpm"
RPM_HASH = "d7e93a17ba7a697497d14774382dba5e77cbb4006ebc936a80c9927e1586a1b16adb9ab700d5538e34adddd5680e664aea799894072be6a1f329545af1a41071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-boisik-doc-cs \
texlive-boisik-doc"

RDEPENDS:${PN} += ""

inherit rpm
