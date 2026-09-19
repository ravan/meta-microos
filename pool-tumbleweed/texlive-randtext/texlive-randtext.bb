SUMMARY = "Randomise the order of characters in strings"
DESCRIPTION = "The package provides a single macro \\randomize{TEXT} that \
typesets the characters of TEXT in random order, such that the \
resulting output appears correct, but most automated attempts \
to read the file will misunderstand it. This function allows \
one to include an email address in a TeX document and publish \
it online without fear of email address harvesters or spammers \
easily picking up the address."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-randtext-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "3bd1e24035305be3ef35160b0fcedf47dbc2f59e3bac3b817c6c39c9da1e22414581d111ca1e610f4a312e5b0dadfff422b3b17bbede6c84d006eeabb3081d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randtext.sty \
texlive-randtext"

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
