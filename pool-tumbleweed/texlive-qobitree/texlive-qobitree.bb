SUMMARY = "LaTeX macros for typesetting trees"
DESCRIPTION = "Provides commands \\branch and \\leaf for specifying the elements \
of the tree; you build up your tree with those commands, and \
then issue the \\tree command to typeset the whole."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-qobitree-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "32c0312a0f6d6fe5802bade856dce007048c4fb6487fb90c8b83d4e07000bd55b8199c6fe6a14aeb868b9fe669dd1f55f75602669f9428e1c0223edae0ba16d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qobitree.tex \
texlive-qobitree"

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
