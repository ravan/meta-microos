SUMMARY = "Basic support for the typesetting of Cyrillic Mongolian documents using (Xe|Lua)LaTeX"
DESCRIPTION = "The 'xecyrmongolian' package can be used to produce documents \
in Cyrillic Mongolian using either XeLaTeX or LuaLaTeX. The \
command \\setlanguage can be used to load alternative \
hyphenation patterns so to be able to create multilingual \
documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-2026.226.1.0svn53160-59.4.noarch.rpm"
RPM_HASH = "22cab1099d7fed10e6fde2a9181764cbea294fcb9dac9f745a0447c2de38fa692ad26f070915eb5972978ba53e36ce4561b0eeb3eb869615af3ff758dae10a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecyrmongolian.sty \
texlive-xecyrmongolian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luahyphenrules.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
