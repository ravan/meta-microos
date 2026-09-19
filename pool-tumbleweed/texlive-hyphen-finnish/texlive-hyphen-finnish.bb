SUMMARY = "Finnish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Finnish in T1 and UTF-8 encodings. The \
older set, labelled just 'fi', tries to implement etymological \
rules, while the newer ones (fi-x-school) implements the \
simpler rules taught at Finnish school."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-finnish-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "104376d7eb100f9392580c6818649c9989d4328dc32342ea8bd9382e0289158f6e9130e579158c9f4a88433e2f72e4e6032f58cd308c59bc8f4f8c5b9d361b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fi-x-school.ec.tex \
tex-hyph-fi-x-school.tex \
tex-hyph-fi.ec.tex \
tex-hyph-fi.tex \
tex-loadhyph-fi-x-school.tex \
tex-loadhyph-fi.tex \
texlive-hyphen-finnish"

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
