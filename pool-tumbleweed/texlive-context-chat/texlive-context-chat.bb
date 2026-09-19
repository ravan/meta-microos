SUMMARY = "Package context-chat"
DESCRIPTION = "The context-chat package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72010"

RPM_NAME = "texlive-context-chat-2026.226.svn72010-61.2.noarch.rpm"
RPM_HASH = "100ac9df480ddf5c457c25300baa04f71e2fc76fce1c40b338445ad25c7b362f2803d1fc5f8e1a85619ff52228d2a502c9cd300e722b079122a5038bc07934e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-chat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
