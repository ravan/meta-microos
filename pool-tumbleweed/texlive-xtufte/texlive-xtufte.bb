SUMMARY = "Extend the tufte document classes to run with unicode-aware engines"
DESCRIPTION = "This package is a modified version of the CTAN package \
tufte-latex, which is under the Apache2 License. The package \
allows you to use LuaLaTeX (and hopefully also XeLaTeX) with \
OpenType and/or TrueType fonts, and also by default Biber \
instead of BibTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn76952"

RPM_NAME = "texlive-xtufte-2026.226.0.0.03svn76952-59.4.noarch.rpm"
RPM_HASH = "4e340d6aac671e2a5bede1e389f20a40c2e09755e6eb2eba7b373071d83b134b4c43953ebd31c1e49ad0b29468ab2f3693409aca12255d76a78152c7f7b69de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtufte-book.cls \
tex-xtufte-common.def \
tex-xtufte-handout.cls \
texlive-xtufte"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beramono.sty \
tex-bibentry.sty \
tex-biblatex.sty \
tex-bidi.sty \
tex-changepage.sty \
tex-chngpage.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-hardwrap.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-juliamono.sty \
tex-makeidx.sty \
tex-mathpazo.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-optparams.sty \
tex-paralist.sty \
tex-placeins.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
