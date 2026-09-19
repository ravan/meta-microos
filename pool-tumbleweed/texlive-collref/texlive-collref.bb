SUMMARY = "Collect blocks of references into a single reference"
DESCRIPTION = "The package automatically collects multiple \\bibitem \
references, which always appear in the same sequence in \\cite, \
into a single \\bibitem block."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.4svn77682"

RPM_NAME = "texlive-collref-2026.226.2.0.4svn77682-60.2.noarch.rpm"
RPM_HASH = "fe06d31a88a11ba8dfd9e1a1c86037075e0e09a38087dcb34c817483544a803b5b502a09eb6d9f59bf6d1443af041f34e2ae1a86e5134429fcf7f6e873aa0f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collref.sty \
texlive-collref"

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
