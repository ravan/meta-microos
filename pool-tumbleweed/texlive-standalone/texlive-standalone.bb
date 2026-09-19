SUMMARY = "Compile TeX pictures stand-alone or as part of a document"
DESCRIPTION = "A class and package is provided which allows TeX pictures or \
other TeX code to be compiled standalone or as part of a main \
document. Special support for pictures with beamer overlays is \
also provided. The package is used in the main document and \
skips extra preambles in sub-files. The class may be used to \
simplify the preamble in sub-files. By default the preview \
package is used to display the typeset code without margins. \
The behaviour in standalone mode may adjusted using a \
configuration file standalone.cfg to redefine the standalone \
environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5asvn77682"

RPM_NAME = "texlive-standalone-2026.226.1.5asvn77682-64.2.noarch.rpm"
RPM_HASH = "321a37c31f1f7cda237c95b18a3797b5909d61f81d85b5b9c713043933c55963bd4e0fdf6f13bd0bc5977da09c9cbff071828a35890b4dfe43560a17092fb02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-standalone.cfg \
tex-standalone.cls \
tex-standalone.sty \
tex-standalone.tex \
texlive-standalone"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-currfile-abspath.sty \
tex-currfile.sty \
tex-filemod-expmin.sty \
tex-gincltex.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-luatex85.sty \
tex-multido.sty \
tex-pdftexcmds.sty \
tex-preview.sty \
tex-pstricks.sty \
tex-shellesc.sty \
tex-tikz.sty \
tex-trimclip.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
texlive \
texlive-adjustbox \
texlive-currfile \
texlive-filemod \
texlive-filesystem \
texlive-gincltex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
