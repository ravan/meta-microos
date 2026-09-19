SUMMARY = "Bibliographies suitable for British Ecological Society journals"
DESCRIPTION = "The package provides a BibTeX style for use with journals \
published by the British Ecological Society. The style was \
produced independently of the Society, and has no formal \
approval by the BES."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-besjournals-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "07dcf4c9b5f4ce17ca5ec976b21c5369d45dd379c7903f657d30d42cdf71ed294093e6115c878e6054e151528bb878ccdfc46649987118243f072234dce73236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-besjournals"

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
