SUMMARY = "Enumitem documentation, in German"
DESCRIPTION = "This is a translation of the manual for enumitem."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24196"

RPM_NAME = "texlive-translation-enumitem-de-2026.226.svn24196-59.2.noarch.rpm"
RPM_HASH = "a7a003044abb3c9d70b551c4f95a8b29fb6e254394cfeadba1f66c0f4292c0da42b556bb26148dad7241d9caa773fed0750ee848d1ee18703d904f70be4c4e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-enumitem-de"

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
