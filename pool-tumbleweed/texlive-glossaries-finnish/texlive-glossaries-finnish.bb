SUMMARY = "Finnish language module for glossaries package"
DESCRIPTION = "Finnish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-2026.226.1.0svn54080-60.4.noarch.rpm"
RPM_HASH = "bde54b11ec00b3782050f56630ecf076f752a01ec1c1e71c627055805aaef42082963d7cd5bec11b59097b138cb216726c0996d8f385afe1305a4a3ac317cea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-finnish-ascii.ldf \
tex-glossaries-finnish-utf8.ldf \
tex-glossaries-finnish.ldf \
texlive-glossaries-finnish"

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
