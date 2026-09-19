SUMMARY = "Typeset examples for TeX courses"
DESCRIPTION = "The package makes it easier to produce examples for TeX course. \
It provides an example environment, which typesets its contents \
on the left of the page, and prints it verbatim on the right."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn33398"

RPM_NAME = "texlive-example-2026.226.svn33398-59.2.noarch.rpm"
RPM_HASH = "12b8e18c234043615d83015ad513322225f8702db35919967c8f109c04d0c35134b5bc806121c1948f096d5588837609426b856476597fb1f15055f85da91670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-example.sty \
texlive-example"

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
