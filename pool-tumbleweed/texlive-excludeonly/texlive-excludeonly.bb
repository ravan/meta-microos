SUMMARY = "Prevent files being \\include-ed"
DESCRIPTION = "The package defines an \\excludeonly command, which is (in \
effect) the opposite of \\includeonly. If both \\includeonly and \
\\excludeonly exist in a document, only files 'allowed' by both \
will be included. The package redefines the internal \\@include \
command, so it conflicts with packages that do the same. \
Examples are the classes paper.cls and thesis.cls."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn17262"

RPM_NAME = "texlive-excludeonly-2026.226.1.0svn17262-59.2.noarch.rpm"
RPM_HASH = "79c97c93a367b936a6568b9291437c9d2f754702ce162bdf7f25de14f4c98f2f1f79168f5cf268bed852d1cd9dff32157d0a3cd164abaf1d718dd84ba41a03b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-excludeonly.sty \
texlive-excludeonly"

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
