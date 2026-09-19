SUMMARY = "Knuth's local information"
DESCRIPTION = "A collection of experimental programs and developments based \
on, or complementary to, the matter in his distribution \
directories."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn57963"

RPM_NAME = "texlive-knuth-local-2026.226.svn57963-63.2.noarch.rpm"
RPM_HASH = "2e6e9f6128173bd44e80467f732e7d53edc2c561c9f1996458eed7ba915711bf38abe2a08d310ed15a116421c93a6979c876b41ea9cae9c2b97bf171dbb2e8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-domino.tfm \
tex-logod10.tfm \
tex-logosl9.tfm \
tex-random.tfm \
tex-snfont.tfm \
tex-xepsf.tex \
texlive-knuth-local"

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
