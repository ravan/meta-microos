SUMMARY = "Support for German typography"
DESCRIPTION = "Supports the old German orthography (alte deutsche \
Rechtschreibung)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5esvn42428"

RPM_NAME = "texlive-german-2026.226.2.5esvn42428-60.2.noarch.rpm"
RPM_HASH = "1edf3a8f70a9886aafa462ab88bea7fe29aafcedecc1a4008c1ea0994611d7fa79d6751885e1a1f0cd900ca2a4bfdabcf339e2b6081548c8e5714cab0e0432d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german.sty \
tex-ngerman.sty \
texlive-german"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
