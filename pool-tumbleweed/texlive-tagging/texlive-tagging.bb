SUMMARY = "Document configuration with tags"
DESCRIPTION = "The package allows the user to generate multiple documents from \
a single source, by marking pieces of the document with tags \
and specifying which marked pieces to include or exclude."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1.0.1svn77682"

RPM_NAME = "texlive-tagging-2026.227.1.1.0.1svn77682-62.2.noarch.rpm"
RPM_HASH = "c0f5eaac3e4cc8b764950a057f06a1b59d2973c34d5f91a4eaf679ab71552d258cc0d526597eb302f443984ee68732e993dc504bd616e73687effa956f6c969f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tagging.sty \
texlive-tagging"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
