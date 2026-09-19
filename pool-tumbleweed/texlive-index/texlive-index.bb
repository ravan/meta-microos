SUMMARY = "Extended index for LaTeX including multiple indexes"
DESCRIPTION = "This is a reimplementation of LaTeX's indexing macros to \
provide better support for indexing. For example, it supports \
multiple indexes in a single document and provides a more \
robust \\index command. It supplies short hand notations for the \
\\index command (^{word}) and a * variation of \\index \
(abbreviated _{word}) that prints the word being indexed, as \
well as creating an index entry for it."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.04svn77682"

RPM_NAME = "texlive-index-2026.226.4.04svn77682-60.2.noarch.rpm"
RPM_HASH = "04a3c39ca97e65d0f271e7314d29cd82a119c626eb1977461482ade9c4ebf4dbade95e3afe6c126a23fc9e6678453450117695ec2b7e108e2fd28907e05afdd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-index.sty \
texlive-index"

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
