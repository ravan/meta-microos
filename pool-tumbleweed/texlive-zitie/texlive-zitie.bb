SUMMARY = "Create CJK character calligraphy practicing sheets"
DESCRIPTION = "This is a LaTeX package for creating CJK character calligraphy \
practicing sheets (copybooks). Currently, only XeTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77682"

RPM_NAME = "texlive-zitie-2026.226.1.4.0svn77682-59.4.noarch.rpm"
RPM_HASH = "abf90f52c03a7ca6d004d76648297b2f0a799a97874dfd140e6573c64294b3ddb961ad32edb3720207f791f1518941a47dfa8fddf85321580e5e320883842a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zitie.luatex.def \
tex-zitie.sty \
tex-zitie.xetex.def \
texlive-zitie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctex.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xeCJK.sty \
tex-xparse.sty \
tex-zhlipsum.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
