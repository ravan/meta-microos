SUMMARY = "Fake a regular font for bold characters"
DESCRIPTION = "This package uses PDF's text rendering to modify the linewidth \
of an outline font to get bold characters. It works only for \
vectorfonts where the glyphs are defined by their outline. The \
package works both in text and in math mode, for pdfLaTeX as \
well as for LuaLaTeX. The package depends on iftex, xkeyval, \
and pdfrender."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn77682"

RPM_NAME = "texlive-xfakebold-2026.226.0.0.10svn77682-59.4.noarch.rpm"
RPM_HASH = "ab87582b90c28675307bed09d32231789db1e7d38b817b1eefda0b45d3dc3140fe1e4f45d34831f96e6264bf20c3517d605661ac12844cf824bd5f599cc2f9b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xfakebold.sty \
texlive-xfakebold"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-pdfrender.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
