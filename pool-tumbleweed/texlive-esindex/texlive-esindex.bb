SUMMARY = "Generate sorting keys for indexes"
DESCRIPTION = "With this package sorting keys can be automatically generated. \
It was originally devised for Spanish, so that, say, \
\\esindex{canon} is correctly alphabetized in the index, but it \
can be configured to generate sorting keys for other languages, \
with custom replacements and multilevel comparisons."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn71111"

RPM_NAME = "texlive-esindex-2026.226.1.8svn71111-61.4.noarch.rpm"
RPM_HASH = "089be4d4330fd1a4115a47d1c13ed45b7f64d5b08e3daba175475a2ab694ba453336fd4d6c6dd6835986fb037eff8829527364d178a498fc5f41e05d232e858c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esindex.sty \
texlive-esindex"

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
