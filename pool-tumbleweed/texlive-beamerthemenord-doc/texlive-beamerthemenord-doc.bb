SUMMARY = "Documentation for texlive-beamerthemenord"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemenord"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn56180"

RPM_NAME = "texlive-beamerthemenord-doc-2026.226.0.0.2.0svn56180-61.2.noarch.rpm"
RPM_HASH = "ff42552101bc73166914f9acca36172b3c728de8557b4a7f707122b9cfb1e48f3e6dc0f47fdbc0b101196f3eab4a36f0ce5f1f0ea3c925ca79953186935be4a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemenord-doc"

RDEPENDS:${PN} += ""

inherit rpm
