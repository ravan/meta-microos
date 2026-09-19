SUMMARY = "Define commands which expand to verbatim text"
DESCRIPTION = "The package defines a single command \\verbdef (which has a \
*-form, like \\verb). \\verbdef will define a robust command \
whose body expands to verbatim text. By using commands defined \
by \\verbdef, one can put verbatim text into the arguments of \
commands; since the defined command is robust, it doesn't \
matter if the argument is moving. (Full details of syntax and \
caveats about use are in comments in the file itself.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-verbdef-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "665ff13abb9406118f32a2e95b3a4d088f5abb7226bd236a35e51157dfb3b2d1c27171dde7709dd4ac1e0bd0fc555ea49c944bd0cb5a7e8b6f206ded99d41fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbdef.sty \
texlive-verbdef"

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
