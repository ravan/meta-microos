SUMMARY = "A BibTeX package to produce lists of authors' best papers"
DESCRIPTION = "Many people preparing their resumes find the requirement \
'please list five (or six, or ten) papers authored by you'. The \
same requirement is often stated for reports prepared by \
professional teams. The creation of such lists may be a \
cumbersome task. Even more difficult is it to support such \
lists over the time, when new papers are added. The BibTeX \
style bestpapers.bst is intended to facilitate this task. It is \
based on the idea that it is easier to score than to sort: We \
can assign a score to a paper and then let the computer select \
the papers with highest scores. This work was commissioned by \
the Consumer Financial Protection Bureau, United States \
Treasury. This package is in the public domain."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-bestpapers-2026.226.1.0svn76790-61.2.noarch.rpm"
RPM_HASH = "e4e0feb6a0d7a4de74861203c137e81e3f4c1e130b77a621e701d38c8f7ec772efd534a09e6c48686fbb65b0d02e571a0c0a81a93a5f56f4b7b87f7a7eefe2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bestpapers"

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
