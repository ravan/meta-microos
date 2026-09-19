SUMMARY = "Precise measurements of glyphs"
DESCRIPTION = "MeasureBox is a (plain TeX) package for measuring material. It \
is intended for precise measurements of glyphs so that they can \
be manipulated by other macros and packages (e.g. the Stretchy \
package). Its only dependency is the pdfToolbox package, which \
is currently only supported by plain-pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75139"

RPM_NAME = "texlive-measurebox-2026.226.1.0svn75139-59.2.noarch.rpm"
RPM_HASH = "e6bc93cdfacf51e210e295e602d4d47e25153d3f193129cbf3dc0b52d8bc1bf075cc70d543f6f13bc673f81541d4946c0dd654fbc94d2335e2ec6e888c887bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-measurebox.tex \
texlive-measurebox"

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
