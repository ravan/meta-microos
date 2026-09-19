SUMMARY = "Index citations by author names"
DESCRIPTION = "This package allows the user to create an index of all authors \
cited in a LaTeX document. Each author entry in the index \
contains the pages where these citations occur. Alternatively, \
the package can list the labels of the citations that appear in \
the references rather than the text pages. The package relies \
on BibTeX being used to handle citations. Additionally, it \
requires Perl (version 5 or higher)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51757"

RPM_NAME = "texlive-authorindex-2026.226.svn51757-60.2.noarch.rpm"
RPM_HASH = "39b2ff6abcd07250fa3134b3437ccd8712e9cfdf5586a044fd65e8b4df101c946d6473dca1da28d390060dafb70e90c1ec32747694d928fe369b4746cf0bb13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authorindex.sty \
texlive-authorindex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Std \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-authorindex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
