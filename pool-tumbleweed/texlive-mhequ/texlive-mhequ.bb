SUMMARY = "Multicolumn equations, tags, labels, sub-numbering"
DESCRIPTION = "The mhequ style file simplifies creating multi-column equation \
environments and tagging equations therein. It supports \
sub-numbering of blocks of equations (like (1.2a), (1.2b), etc) \
and references to each equation individually (1.2a) or to the \
whole block (1.2). The labels can be shown in draft mode. The \
default behaviour is to show an equation number if and only if \
the equation actually has a label, which reduces visual \
clutter. Comments in the package itself describe its usage, \
which should also be self-evident from the provided example \
file."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.72svn64978"

RPM_NAME = "texlive-mhequ-2026.226.1.72svn64978-61.2.noarch.rpm"
RPM_HASH = "2a82a9fee120774ddbdbb6340124cdf781aa5033fe35097891814f55ecad2e2901720f04a1e81b258bd1c5f5332d087a6152766d7b437132a1b0612489697189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mhequ.sty \
texlive-mhequ"

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
