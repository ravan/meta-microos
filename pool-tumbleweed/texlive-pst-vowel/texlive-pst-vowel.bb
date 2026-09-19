SUMMARY = "Enable arrows showing diphthongs on vowel charts"
DESCRIPTION = "The package extends the vowel package (distributed as part of \
the tipa bundle) by allowing the user to draw arrows between \
vowels to show relationships such as diphthong membership. The \
package depends on use of pstricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-2026.226.1.0svn25228-60.4.noarch.rpm"
RPM_HASH = "788e20d86b67c0ac4f74d05d1b32e92d472090d6007e3db5c2a7b91078227e7b86bbeca62fa7bc35d30e18ffe8ca04fae511a43c7501bdfb539d80e7135eb097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-vowel.sty \
texlive-pst-vowel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-vowel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
