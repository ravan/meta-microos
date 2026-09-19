SUMMARY = "Format captions inside multicols"
DESCRIPTION = "This is a package for formatting captions of column figures and \
column tabular material, which cannot be standard floats in a \
multicols environment. The package also provides a convenient \
way to customise your captions, whether they be in multicols or \
not."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-multicap-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "ce1e7a96f9fd8f4177406ef39f45eb87fb5e845d28f6816fbe3e436fe279abcabb2324196d23d8748bcd20c709286db1c39859c6a5775ce2b61c3968a87865dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multicap.sty \
texlive-multicap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
