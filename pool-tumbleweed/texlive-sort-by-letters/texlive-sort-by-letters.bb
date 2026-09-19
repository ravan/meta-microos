SUMMARY = "Bibliography styles for alphabetic sorting"
DESCRIPTION = "This bundle contains several bibliography styles for separating \
a document's references by the first letter of the first \
author/editor in the bibliography entry. The styles are adapted \
from standard ones or from natbib ones."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-sort-by-letters-2026.226.svn76790-64.2.noarch.rpm"
RPM_HASH = "08694c9c24cfcf5f9ef8fbb8f147bb8043556560cfc70654280d041c897eb30dd4b68aec99a5f0a9b44b65c61a03a49abae41ebf11400c237b201e49c8653d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sort-by-letters"

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
