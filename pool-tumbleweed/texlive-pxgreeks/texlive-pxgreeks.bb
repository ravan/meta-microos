SUMMARY = "Shape selection for PX fonts Greek letters"
DESCRIPTION = "The package allows LaTeX maths users of the PX fonts to select \
the shapes (italic or upright) for the Greek lowercase and \
uppercase letters. Once the shapes for lowercase and uppercase \
have been selected via a package option, the \\other prefix \
(e.g., \\otheralpha) allows using the alternate glyph (as in the \
fourier package). The pxgreeks package does not constrain the \
text font that may be used in the document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-2026.226.1.0svn21838-60.4.noarch.rpm"
RPM_HASH = "cbd23a334df3c1483d87556f6d8a547e9c55ad7f566fd28a78760325ec18b9b6ebceee037ebd79f19f2149625dc04444c7efccb1591f881d24e316d1de8d2a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxgreeks.sty \
texlive-pxgreeks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pxfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
