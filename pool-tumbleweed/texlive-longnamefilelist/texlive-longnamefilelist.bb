SUMMARY = "Tidy \\listfiles with long file names"
DESCRIPTION = "The package equips LaTeX's \\listfiles command with an optional \
argument for the number of characters in the longest base \
filename. This way you get a neatly aligned file list even when \
it contains files whose base names have more than 8 characters. \
The package can be combined with the myfilist package as \
explained in the documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-longnamefilelist-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "7004aee0f9c5f81df6139fce01ec054242bd1a42530810d1380250b30cb853cfbd7df282b59e22754e6389e02faee2ca23e6c73c9d265aebd1b2b917eb409f99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longnamefilelist.sty \
texlive-longnamefilelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-myfilist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
