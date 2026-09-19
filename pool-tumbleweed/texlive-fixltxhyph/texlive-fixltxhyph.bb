SUMMARY = "Allow hyphenation of partially-emphasised substrings"
DESCRIPTION = "The package fixes the problem of TeX failing to hyphenate \
letter strings that seem (to TeX) to be words, but which are \
followed by an apostrophe and then an emphasis command. The \
cause of the problem is not the apostrophe, but the font change \
in the middle of the string. The problem arises in Catalan, \
French, Italian and Romansh."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn73227"

RPM_NAME = "texlive-fixltxhyph-2026.226.0.0.5svn73227-59.2.noarch.rpm"
RPM_HASH = "a53a0022cc076cf1d384e57e9809b6a1867f78b816f85aed44fb6fae8b8cc40b71712618c168064c25ac0382ee85c3c4018e15fdeb498e71213942f6c18c4f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixltxhyph.sty \
texlive-fixltxhyph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
