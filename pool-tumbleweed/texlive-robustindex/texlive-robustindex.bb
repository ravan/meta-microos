SUMMARY = "Create index with pagerefs"
DESCRIPTION = "Third parties often change the page numbers without rerunning \
makeindex. One would like to make the page numbers in the index \
entries more robust. This bundle provides robustindex.sty and \
robustglossary.sty, which use the \\pageref mechanism to \
maintain correct page numbers."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49877"

RPM_NAME = "texlive-robustindex-2026.226.svn49877-60.2.noarch.rpm"
RPM_HASH = "9738f1fb7e658875076347af8777a74b79d95774ad87711597d6d40fcfce5fb643b82a72f69e8b4102da7a94a82cff77efd2f3a26c0229eb37a3e895a066c7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robustglossary.sty \
tex-robustindex.sty \
texlive-robustindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
