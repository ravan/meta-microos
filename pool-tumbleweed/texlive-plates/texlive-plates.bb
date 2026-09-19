SUMMARY = "Arrange for 'plates' sections of documents"
DESCRIPTION = "The plates package provides a simple facility for inserting \
colour figures in a document when they should be gathered and \
printed together as in a book's section of colour plates. The \
package provides a plate environment that takes the place of \
the figure environment for such colour images."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-plates-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "8fbe9d0278de8c12487baa88add6fd39850a2a8b9aa45fb046679d7ceddf83ae9f93d12d46ab3dc320da138bbd8c4db972585eb44481e634ec33a76b1be7da09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endplate.sty \
tex-plates.sty \
texlive-plates"

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
