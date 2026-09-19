SUMMARY = "Collect files related to a LaTeX job in a single directory"
DESCRIPTION = "The Perl script parses a LaTeX file recursively, scanning all \
child files, and collects details of any included and other \
data files. These component files, are then all put into a \
single directory (thus 'flattening' the document's directory \
tree)."
LICENSE = "Artistic-1.0"

PV = "2026.227.1.3svn55064"

RPM_NAME = "texlive-texdirflatten-2026.227.1.3svn55064-62.2.noarch.rpm"
RPM_HASH = "a1cd96aae2242e67c08f72ccc2b1f8c004d61f32cffe3570429374ed5266b310d83bd565ae7a92198ea5a9dcea6fa715d6641a4e0ae9f70bba3991c3b925a0c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdirflatten"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-re \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texdirflatten-bin"

inherit rpm
