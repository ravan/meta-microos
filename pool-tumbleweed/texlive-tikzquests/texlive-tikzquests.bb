SUMMARY = "A parametric questions' repositories framework"
DESCRIPTION = "This is a framework for building parametric questions' \
repositories, which can be further used to construct parametric \
questions for exams. Unlike other packages of the kind this \
does not try to enforce any pre-defined presentation format, \
focusing only on how to set a repository of questions and use \
them."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn77050"

RPM_NAME = "texlive-tikzquests-2026.226.2.3svn77050-59.2.noarch.rpm"
RPM_HASH = "11baa94d4308b9944b3f5be9c25df5e76d4e90d0ef6dd0897287b1e722f6d7dec774959605a3640160099d6313fd0f52642efdf37e169c49c4f4c021308d792c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzquests.sty \
texlive-tikzquests"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
