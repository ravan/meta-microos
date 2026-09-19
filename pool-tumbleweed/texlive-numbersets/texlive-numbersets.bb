SUMMARY = "Display number sets with customizable typefaces"
DESCRIPTION = "This package allows users to express mathematical concepts \
related to sets of numbers using meaningful commands rather \
than relying on visual representations. Key Features: Command \
to specify typefaces for number sets. Interface for defining \
typeface rules. Interface for creating commands that represent \
number sets. Several predefined presets for common number sets."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn76924"

RPM_NAME = "texlive-numbersets-2026.226.0.0.2.0svn76924-61.2.noarch.rpm"
RPM_HASH = "50f6604c3ebcc84bf2b6779590af31549af90073c76f65edc6fbfeb738bd4525d8cc896aa1c74c05ae1b30b1762e592f6b47f0e5d3f874bb0c16ff94695ffbc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numbersets.sty \
texlive-numbersets"

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
