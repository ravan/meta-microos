SUMMARY = "New implementation of picture commands"
DESCRIPTION = "This package was described in the 2nd edition of 'LaTeX: A \
Document Preparation System', but the LaTeX project team \
declined to produce the package. For a long time, LaTeX \
included a 'pict2e package' that merely produced an apologetic \
error message. The new package extends the existing LaTeX \
picture environment, using the familiar technique (cf. the \
graphics and color packages) of driver files (at present, \
drivers for dvips, pdfTeX, LuaTeX, XeTeX, VTeX, dvipdfm, and \
dvipdfmx are available). The package documentation has a fair \
number of examples of use, showing where things are improved by \
comparison with the LaTeX picture environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4bsvn77682"

RPM_NAME = "texlive-pict2e-2026.226.0.0.4bsvn77682-58.2.noarch.rpm"
RPM_HASH = "203b59c0b6d57a458e02854f5d43ea2baf565b6851ae8f90e6961947bd48d91fb7d6349a9916e023c8564b0deb3f5c4e9e4b568b64eb2782c643d9c778177491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-p2e-dvipdfm.def \
tex-p2e-dvipdfmx.def \
tex-p2e-dvips.def \
tex-p2e-luatex.def \
tex-p2e-pctex32.def \
tex-p2e-pctexps.def \
tex-p2e-pdftex.def \
tex-p2e-textures.def \
tex-p2e-vtex.def \
tex-p2e-xetex.def \
tex-pict2e.cfg \
tex-pict2e.sty \
texlive-pict2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-trig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
