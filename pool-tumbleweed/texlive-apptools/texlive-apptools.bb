SUMMARY = "Tools for customising appendices"
DESCRIPTION = "The package provides an \\AtAppendix command to add code to a \
hook that is executed when \\appendix is called by the user. \
Additionally, a TeX conditional \\ifappendix and a LaTeX-style \
conditional \\IfAppendix are provided to check if \\appendix has \
already been called."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-apptools-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "6a532c801f905d9e8a8cbcd9619d3cc2e9c030d4ae20bf5dfa08bfe8c0ac93663ebd94375d09bdf41af27c54872c085887acfe5330aee9a1f5dd7afc1390ebfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apptools.sty \
texlive-apptools"

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
