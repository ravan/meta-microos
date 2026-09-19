SUMMARY = "Apply a macro to each line of an environment"
DESCRIPTION = "The package defines an environment 'parse lines' which \
processes each line of an environment with a macro. An example \
of shading the lines of an environment is given."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn21475"

RPM_NAME = "texlive-parselines-2026.226.1.4svn21475-58.2.noarch.rpm"
RPM_HASH = "c440383a96e0b50b7e67bc81dfd89432b0371ae6a6c30444a9b2710012121d60e95c7d4d1bff8bfbc0103c48cd82633ef45c0e4136f589dd908f4f9fe7de5256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parselines.sty \
texlive-parselines"

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
