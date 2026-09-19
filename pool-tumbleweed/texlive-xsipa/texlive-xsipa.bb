SUMMARY = "Short XSAMPA-based commands for IPA transcription in LaTeX"
DESCRIPTION = "This LaTeX package provides a lightweight phonetic \
transcription system inspired by XSAMPA. It translates modified \
XSAMPA sequences into proper IPA symbols, using either the tipa \
package (for pdfTeX users) or Unicode IPA symbols via xunicode \
(for XeTeX and LuaTeX users). The package was designed to \
simplify phonetic transcription in LaTeX by offering concise \
macros such as \\xsE for \\textepsilon, and \\xs*...* as a \
shortcut for multi-symbol sequences (e.g., \\xs*EO* for eo). \
These commands are modeled after XSAMPA but adapted for LaTeX \
compatibility -- including custom replacements for reserved \
characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-xsipa-2026.226.1.0svn76924-59.4.noarch.rpm"
RPM_HASH = "d9806812876038cb7297d841fc5e8cf5c19aa6d044735870f40fc88492e24958dff25afaca1955249d15828feed29bc891a410e0eb03109e8f59627cc012b4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xsipa.sty \
texlive-xsipa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-tipa.sty \
tex-xparse.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-scripts \
texlive-scripts-bin \
texlive-tipa \
texlive-xunicode"

inherit rpm
