SUMMARY = "Dedicated global stacks implementations"
DESCRIPTION = "This package aims at solving one problem: how to preserve some \
values (tokens) beyond a variable number of nested groups. Four \
alternative strategies are implemented."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77979"

RPM_NAME = "texlive-xstacks-2026.226.1.1svn77979-59.4.noarch.rpm"
RPM_HASH = "83b0b9d7c9d63a96bfa4f51cbb3bb4c349d18874db69b67530c6c313f8976bfb6418ab6ab02a58168589e801d4161ae4cade7ac9a8dba006bcbd5a7a41520eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xstacks.sty \
texlive-xstacks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
tex-tokglobalstack.sty \
tex-tokgroupmark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
