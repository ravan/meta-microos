SUMMARY = "Assorted support files for use with PSTricks"
DESCRIPTION = "An appropriate set of job options, together with process \
scripts for use with TeXnicCenter/"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pst-support-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "eb44ecf074b231bde747349d5c61c43fc7614c3bdb97a9a9c1c10778308dc66e2f4ccf2f8a255b75b32047626d386cbebeb698ea3bf680904acd75ec92fd155f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-support"

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
