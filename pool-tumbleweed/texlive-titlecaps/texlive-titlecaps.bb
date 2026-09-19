SUMMARY = "Setting rich-text input into Titling Caps"
DESCRIPTION = "The package is intended for setting rich text into titling \
capitals (in which the first character of words are \
capitalized). It automatically accounts for diacritical marks \
(like umlauts), national symbols (like 'ae'), punctuation, and \
font changing commands that alter the appearance or size of the \
text. It allows a list of predesignated words to be protected \
as lower-cased, and also allows for titling exceptions of \
various sorts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-titlecaps-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "30a8f6fa67e3a7264601353e10e7f5208cfd890b0196f37e3517ac93125f09bdfd3572835cdfee65c4df2526fe8f58e7be354bf10928b48e806ee3d4f8e74db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titlecaps.sty \
texlive-titlecaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifnextok.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
