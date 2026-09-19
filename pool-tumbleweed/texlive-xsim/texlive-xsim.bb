SUMMARY = "EXercise Sheets IMproved"
DESCRIPTION = "This package helps in creating exercises and the corresponding \
solutions. It is the official successor of the exsheets package \
and fixes/improves various long-standing issues."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn76924"

RPM_NAME = "texlive-xsim-2026.226.0.0.21svn76924-59.4.noarch.rpm"
RPM_HASH = "885273d078bc3feac13faafb36323ab3359b317c96ad00d67a66832550a32ed01c6e7fa9a93f5d6b7dc9751704d6b3f0ebe873143ac055a88b52b320821793dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xsim-manual.cls \
tex-xsim.sty \
tex-xsim.style.layouts.code.tex \
tex-xsimverb.sty \
texlive-xsim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-acro.sty \
tex-amsmath.sty \
tex-array.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-cnltx-doc.cls \
tex-csquotes.sty \
tex-datetime2.sty \
tex-embrac.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-imakeidx.sty \
tex-l3keys2e.sty \
tex-lipsum.sty \
tex-longtable.sty \
tex-marginnote.sty \
tex-newtxmath.sty \
tex-refcount.sty \
tex-tcolorbox.sty \
tex-translations.sty \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
