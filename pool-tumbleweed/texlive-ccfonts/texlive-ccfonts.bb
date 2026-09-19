SUMMARY = "Support for Concrete text and math fonts in LaTeX"
DESCRIPTION = "LaTeX font definition files for the Concrete fonts and a LaTeX \
package for typesetting documents using Concrete as the default \
font family. The files support OT1, T1, TS1, and Concrete \
mathematics including AMS fonts (Ulrik Vieth's concmath)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ccfonts-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "4ee0f481b8782d46d0d9e22535b54644b235d0dd8894353226053dfd3c5570a3e9d3f4befd049f19a74f20cd096019b017fc2c9d3a6752a97628522b7995150e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccfonts.sty \
tex-t1ccr.fd \
tex-ts1ccr.fd \
texlive-ccfonts"

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
