SUMMARY = "Tool macros"
DESCRIPTION = "A package for (La)TeX which provides some macros which are \
convenient for writing indexes, glossaries, or other macros. It \
contains macros which support: implicit macros; fancy optional \
arguments; loops over tokenlists and itemlists; searching and \
splitting; controlled expansion; redefinition of macros; and \
concatenated macro names; macros for text replacement."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.1svn32260"

RPM_NAME = "texlive-toolbox-2026.226.5.1svn32260-59.2.noarch.rpm"
RPM_HASH = "cb5b9bb2f16905d8a8014eef64d4f863359220b925a2dfc0d5275a0341bbae0e1c252724d79353d4352e187faf784507cb497d289b6ebf2954ec2fa35bc76d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-toolbox.sty \
texlive-toolbox"

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
