SUMMARY = "Bibliography style that approaches APA requirements"
DESCRIPTION = "Described as a 'local adaptation' of apalike (which is part of \
the base BibTeX distribution)."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-apalike2-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "1bcf996cff17e5f197e893e1c89029b54d9b7abe5dc16a8fcd1f63f711052a8ae4b4dc9f8ada59aec6b634c5e46fa2faea3b10876f2bd20b4a395426680e734d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike2"

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
