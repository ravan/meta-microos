SUMMARY = "MathGL scripts for LaTeX documents"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package allows to use MathGL scripts in LaTeX documents."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-tex-8.0.3-2.6.noarch.rpm"
RPM_HASH = "03ec1c1ceecdc68445d82689d39396b6b606a8c0f9dc477f53db30c46aad0fec58dd6b4ec2cabbd92d7c48e9ab0a712176404865837ca6382a4b16d38a15754f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex \
tex-mgltex.sty"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
mathgl-tools \
texlive"

inherit rpm
