SUMMARY = "Patch loaded packages, etcetera"
DESCRIPTION = "The package defines macros that allow patching of existing \
commands, specifying those parts of the existing macro to be \
replaced, along with the replacements. Thus it provides more \
sophisticated manipulation than a package like patchcmd, which \
only permits modification by adding commands at the beginning \
or end of an existing definition. The package is distributed in \
a relative of LaTeX doc format: it will run unmodified, though \
it benefits from docstrip treatment."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42428"

RPM_NAME = "texlive-patch-2026.226.svn42428-58.2.noarch.rpm"
RPM_HASH = "ba13562981c46435aea58ad173e87428afc30b5af53a91b2b818d59fafc79400e812a1c3f745b51387d57b7ff61f832f183984ee47c79130d9cff9d34b31bef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patch"

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
