SUMMARY = "Documentation for texlive-q-and-a"
DESCRIPTION = "This package includes the documentation for texlive-q-and-a"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-q-and-a-doc-2026.226.svn76924-60.4.noarch.rpm"
RPM_HASH = "2e82c69e5ee99d2b39bc4e350aefc2253dfc9ed700caf17ce93a26de4ff24f75788d1f7a39865db8e2bb263a8d9b787f6d84b90a923ac39acbce4f80a1de189c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-q-and-a-doc-zh;de;en;fr \
texlive-q-and-a-doc"

RDEPENDS:${PN} += ""

inherit rpm
