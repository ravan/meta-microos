SUMMARY = "The QualiType font collection"
DESCRIPTION = "These 45 fonts were created by QualiType. With the kind \
permisison of John Colletti, these fonts have been released as \
free and open-source."
LICENSE = "OFL-1.1"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-qualitype-2026.226.svn54512-60.4.noarch.rpm"
RPM_HASH = "490b4f19c3497fd101bd7cc2cb80a3ac667523264f99958ca06bf2505f92a131a4576e5d38ca48e9e70135bcb2a10a8980ed181bf52b0adb49b07b717ea2dfa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype"

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
texlive-qualitype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
