SUMMARY = "Support for CJK documents in XeLaTeX"
DESCRIPTION = "A LaTeX package for typesetting CJK documents in the way users \
have become used to, in the CJK package. The package requires a \
current version of xtemplate (and hence of the current LaTeX3 \
development environment)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.9.1svn77682"

RPM_NAME = "texlive-xecjk-2026.226.3.9.1svn77682-59.4.noarch.rpm"
RPM_HASH = "579d13b21b5e8d080d6f759fb00cf224a6af4d11a46ef890d8dc94792d1162e1c2a97421dbb7a4c375b5ffa0299ac632b7b1087d01f75c891a8f2a4e863c5edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-full-stop.map \
tex-fullwidth-stop.map \
tex-han-simp.map \
tex-han-trad.map \
tex-xeCJK-listings.sty \
tex-xeCJK.cfg \
tex-xeCJK.sty \
tex-xeCJKfntef.sty \
tex-xunicode-addon.sty \
tex-xunicode-extra.def \
texlive-xecjk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctexhook.sty \
tex-expl3.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-ulem.sty \
tex-xparse.sty \
tex-xtemplate.sty \
tex-xunicode.sty \
texlive \
texlive-ctex \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
