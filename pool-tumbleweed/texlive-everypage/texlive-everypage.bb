SUMMARY = "Provide hooks to be run on every page of a document"
DESCRIPTION = "The package provides hooks to perform actions on every page, or \
on the current page. Specifically, actions are performed after \
the page is composed, but before it is shipped, so they can be \
used to prepare the output page in tasks like putting \
watermarks in the background, or in setting the next page \
layout, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn77682"

RPM_NAME = "texlive-everypage-2026.226.2.0bsvn77682-59.2.noarch.rpm"
RPM_HASH = "b46dd033268d40dcb395f4ede5eb9e56aa4edfe92bc19cacdda67d81d771591712565c29b2ed5ad3edea71025d427c6f44ca354f0023e7932db0ef693e33ffe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everypage-1x.sty \
tex-everypage.sty \
texlive-everypage"

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
