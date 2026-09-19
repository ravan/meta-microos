SUMMARY = "Documentation for texlive-currvita"
DESCRIPTION = "This package includes the documentation for texlive-currvita"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-currvita-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "8e1f3d0f920468634d8cb63431bfb17a28a0852e58fad0aaae678eb419d74278c7c8a8994ee714c5c6b8a271b7633f5a790f580f37b4243144bbb81057e23632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currvita-doc"

RDEPENDS:${PN} += ""

inherit rpm
