SUMMARY = "Bibliographic style file for Biomedical Journals"
DESCRIPTION = "This BibTeX style file is generated with the docstrip utility \
and modified manually to meet the Uniform Requirements for \
Manuscripts Submitted to Biomedical Journals as published in N \
Engl J Med 1997;336:309-315 (also known as the Vancouver \
style). The complete set of requirements may be viewed on the \
ICMJE web site."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-vancouver-2026.226.1.0svn76790-60.2.noarch.rpm"
RPM_HASH = "36fb9acc70c1afa3bf89266828542cb8fe6bc10ee74432a4049a0a456ebe73e726106d4612deae008b63302c3729c7e6afde7cccd906f8e662eda5fd3fb21c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vancouver"

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
