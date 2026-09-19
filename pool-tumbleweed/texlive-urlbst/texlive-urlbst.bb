SUMMARY = "Web support for BibTeX"
DESCRIPTION = "Supports a new BibTeX 'webpage' entry type and 'url', \
'lastchecked', and 'eprint' and 'DOI' fields. The Perl script \
urlbst can be used to add this support to an arbitrary .bst \
file which has a reasonably conventional structure. The result \
is meant to be robust rather than pretty."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9.1svn76790"

RPM_NAME = "texlive-urlbst-2026.226.0.0.9.1svn76790-60.2.noarch.rpm"
RPM_HASH = "053d0a68bf4a501496492a12a6ce9c845d9a2c91aee5427386a51dfbb69a8e813dac2fc098574f827b7d4494f8f60d2b5665de3dbc29a3c3bb19d3150036dd55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urlbst"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
texlive-scripts-bin \
texlive-urlbst-bin"

inherit rpm
