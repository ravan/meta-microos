SUMMARY = "Tools to define and use stacks"
DESCRIPTION = "The package provides a small set of commands to implement \
stacks independently of TeX's own stack. As an example of how \
the stacks might be used, the documentation offers a small \
'relinput' package that implements the backbone of the import \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn15878"

RPM_NAME = "texlive-stack-2026.226.1.00svn15878-64.2.noarch.rpm"
RPM_HASH = "793dfa2d5b53315169fbd79466739ee00331b5194e97bab2bd008f561ac4e71a6acfdb2603512ba873f6e097f3eff80b12f497e6db53b0f88e3ca51852d9d817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-relinput.sty \
tex-stack.sty \
texlive-stack"

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
