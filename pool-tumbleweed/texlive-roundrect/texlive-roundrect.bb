SUMMARY = "MetaPost macros for highly configurable rounded rectangles (optionally with text)"
DESCRIPTION = "The roundrect macros for MetaPost provide ways to produce \
rounded rectangles, which may or may not contain a title bar or \
text (the title bar may itself contain text). They are \
extremely configurable."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn39796"

RPM_NAME = "texlive-roundrect-2026.226.2.2svn39796-60.2.noarch.rpm"
RPM_HASH = "87d87c085e9f651141846fcee587fab8cd6cec1fe28c808735f80cb943401f7c1a4749b14cc5e9f987179a03e2d35d8adb0e113112d3da2c83da8b11c391379e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundrect"

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
