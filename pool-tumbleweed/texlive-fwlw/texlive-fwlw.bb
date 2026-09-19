SUMMARY = "Get first and last words of a page"
DESCRIPTION = "The package extracts the first and last words of a page, \
together with the first word of the next page, just before the \
page is formed into the object to print. The package defines a \
couple of page styles that use the words that have been \
extracted."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-fwlw-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "03cff9127ace7eff5b8e96a592913dca9e8fb61d64cdb2dbf5209dc57e0cded07ea85c33f0a92e94d79640891ce7a1394533109f41763c96ca9e99f8196940b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fwlw.sty \
texlive-fwlw"

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
