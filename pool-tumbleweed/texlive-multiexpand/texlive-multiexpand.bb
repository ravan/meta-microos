SUMMARY = "Variations on the primitive command \\expandafter"
DESCRIPTION = "The package provides two user commands; one that performs \
multiple expansions, and one that does multiple \\expandafter \
operations, in a single macro call. The author suggests that \
the same effect could be provided by use of the command variant \
mechanisms of LaTeX 3 (see, for example, the interface \
documentation of the experimental LaTeX 3 kernel)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-multiexpand-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "a796345dff7342704edeef28227d30f30ec3d1b0e4d2db686d0627e4f713758005fc86e455fc189f0244691585058713fde7d908f510751a130c127ea8ce334f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiexpand.sty \
texlive-multiexpand"

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
