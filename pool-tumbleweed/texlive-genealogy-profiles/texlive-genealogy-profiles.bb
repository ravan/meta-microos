SUMMARY = "Genealogical profiles for LaTeX"
DESCRIPTION = "This package enables the presenstation of individual profiles, \
which may be useful for genealogical or local history \
treatises. Each profile is typeset using key/value-configurable \
environments, and a number of macros are provided to enable \
references and name formatting."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77110"

RPM_NAME = "texlive-genealogy-profiles-2026.226.svn77110-60.2.noarch.rpm"
RPM_HASH = "1e6b2a764c89938c1fc02d1a6543640b0e160285fe470cae008b890b57c2e0a63f4266168dcf4cc5bdb2910434f91e52b4cd963a5992d4a5bc660fa8b0971f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-genealogy-profiles.sty \
texlive-genealogy-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-genealogytree.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
