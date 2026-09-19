SUMMARY = "PDE Solver using a Finite Element/Finite Volume approach"
DESCRIPTION = "Package for solving Diffusion Advection Reaction (DAR) Partial Differential Equations. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.12"

RPM_NAME = "octave-forge-msh-1.0.12-2.7.noarch.rpm"
RPM_HASH = "8c68434a3f27958530d32071482321c769f0d6767a96e758c3e4cf11880d8502e069d85632a06b4f135908f3de2ce8a5a26598d3f442261b00932932034dfbb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-msh"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-splines"

inherit rpm
