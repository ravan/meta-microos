SUMMARY = "Documentation for texlive-longnamefilelist"
DESCRIPTION = "This package includes the documentation for texlive-longnamefilelist"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-longnamefilelist-doc-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "152bed253df34168b172a1eddac753f1375a0b5c5f8b19b6b221955abde04d22f0aba7066572d6308960fa9978d036195c715e5e8016137bbe6fcc83d2768b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longnamefilelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
