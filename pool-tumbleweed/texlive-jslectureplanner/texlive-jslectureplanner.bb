SUMMARY = "Creation and management of university course material"
DESCRIPTION = "The jslectureplanner package facilitates the generation and \
management of university course material. It provides an \
interface to set up and access centralized course data that can \
be reused in all course documents. Furthermore, the package is \
able to calculate the session dates of a whole semester and \
generate course programs, if the course is held weekly and the \
date of the first lecture is specified. Moreover, the package \
can be used to generate a sectioned course bibliography via \
BibLaTeX. The bundle also includes a package jsmembertable.sty \
that helps in generating course member and presence lists."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn77682"

RPM_NAME = "texlive-jslectureplanner-2026.226.1.15svn77682-63.2.noarch.rpm"
RPM_HASH = "be54e80349e4a1e3eb8f97bd996afcfdfe9425d508adb91b64d07d924ef5fc0cccd651ce9a8c867b168beef78016389e62d3ae95afce535ffc57386326a12980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jslectureplanner.sty \
tex-jsmembertable.sty \
texlive-jslectureplanner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-datatool.sty \
tex-datetime2.sty \
tex-etoolbox.sty \
tex-hhline.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
