SUMMARY = "German version of filecontents"
DESCRIPTION = "This is a 'translation' of the filecontents documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24010"

RPM_NAME = "texlive-translation-filecontents-de-2026.226.svn24010-59.2.noarch.rpm"
RPM_HASH = "6d24dc52639ea897aab0eb5858e44b37f0234c58673d9a2436f1db7e5cb955fa78c3c3128c4d51c78015c28d2405e6484f3bf4ce880a94913945d290e56c4e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-filecontents-de"

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
