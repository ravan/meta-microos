SUMMARY = "Bundle for unit tests and pattern matching"
DESCRIPTION = "This is the public release of the qstest bundle (written for \
DocScape Publisher) (C) 2006, 2007 QuinScape GmbH. The bundle \
contains the packages 'makematch' for matching patterns to \
targets (with a generalization in the form of pattern lists and \
keyword lists), and 'qstest' for performing unit tests, \
allowing the user to run a number of logged tests ensuring the \
consistency of values, properties and call sequences during \
execution of test code. Both packages make extensive use of in \
their package documentation, providing illustrated examples \
that are automatically verified to work as expected. Check the \
README file for details."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73069"

RPM_NAME = "texlive-qstest-2026.226.svn73069-60.4.noarch.rpm"
RPM_HASH = "20774725fdd06dd07f26759ae85e9ec4bf2d3ed6317c304a06571f414086b9431e72335a8814fc4a36ddc5fe22a82f28d380e90479ccdf9ccf9b5163e3603dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makematch.sty \
tex-qstest.sty \
texlive-qstest"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
