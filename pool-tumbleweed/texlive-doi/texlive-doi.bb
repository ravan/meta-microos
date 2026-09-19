SUMMARY = "Create correct hyperlinks for DOI numbers"
DESCRIPTION = "You can hyperlink DOI numbers to doi.org. However, some \
publishers have elected to use nasty characters in their DOI \
numbering scheme ('<', '>', '_' and ';' have all been spotted). \
This will either upset (La)TeX, or your PDF reader. This \
package contains a single user-level command \\doi{}, which \
takes a DOI number, and creates a correct hyperlink to the \
target of the DOI."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-doi-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "ad6de4adf13f2a045313ab827aaec07ea3fd137f0e73c01acc2c89fb998db1e0c8b88ad712fa7b32c0a7ae898334ef6b6e4c6cfd10fd665c32e7d94aaeaeffc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doi.sty \
texlive-doi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
