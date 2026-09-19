SUMMARY = "Belarusian hyphenation patterns"
DESCRIPTION = "Belarusian hyphenation patterns in T2A and UTF-8 encodings"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-belarusian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "20a1bad95d145e952d6d7097f5382f3896d9e13a34b54edfe4be9a1111d647ad993fe9dfd37e17f4451145dc00a2966400fb0eea8799f4878bfff26e67b59ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-be.t2a.tex \
tex-hyph-be.tex \
tex-hyph-quote-be.tex \
tex-loadhyph-be.tex \
texlive-hyphen-belarusian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
