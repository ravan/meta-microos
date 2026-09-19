SUMMARY = "Diagram macros by Francois Borceux"
DESCRIPTION = "The macros support the construction of diagrams, such as those \
that appear in category theory texts. The user gives the list \
of vertices and arrows to be included, just as when composing a \
matrix, and the program takes care of computing the dimensions \
of the arrows and realizing the pagesetting. All the user has \
to do about the arrows is to specify their type (monomorphism, \
pair of adjoint arrows, etc.) and their direction (north, \
south-east, etc.); 12 types and 32 directions are available."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21047"

RPM_NAME = "texlive-borceux-2026.226.svn21047-59.2.noarch.rpm"
RPM_HASH = "3de296d9be8d22878f04186729e0bfe4e7842046285e02f4f0a5f9bf4554d0aaf4cb09f3c68fda81997eacb403a8f93e64e6cf34449980894648485ad76c16b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-borceux"

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
