SUMMARY = "Finnish introduction to LaTeX"
DESCRIPTION = "This is the Finnish translation of Short Introduction to \
LaTeX2e, with added coverage of Finnish typesetting rules."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-lshort-finnish-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "97c486f675008cdac809b39fb7404c995c9c65e86d3da9f2f24d010f6584af7eb70e0ae88c15f811be08a1ef40db1e6484aff7abb101dc47883ab2184363a158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-finnish"

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
