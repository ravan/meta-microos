SUMMARY = "Octave Symbolic Package using SymPy"
DESCRIPTION = "Adds symbolic calculation features to GNU Octave. \
These include common Computer Algebra System tools such as algebraic \
operations, calculus, equation solving, Fourier and Laplace transforms, \
variable precision arithmetic and and other features. Compatibility \
with other symbolic toolboxes is a goal. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.2"

RPM_NAME = "octave-forge-symbolic-3.2.2-1.6.noarch.rpm"
RPM_HASH = "db23717569d1d9dc4e17fbee87dbfed23165aa39350ed4a29272e20756eabb64ea30de17f1da888f37a61ec8543012de666f218f3bf1f176d2b436ddbceb4d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-symbolic"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
python3-numpy \
python3-sympy"

inherit rpm
