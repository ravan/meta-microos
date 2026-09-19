SUMMARY = "Small Octave Toolbox for Kriging"
DESCRIPTION = "The STK is a (not so) Small Toolbox for Kriging. Its primary focus \
in on the interpolation/regression technique known as kriging, which \
is very closely related to Splines and Radial Basis Functions, and can be \
interpreted as a non-parametric Bayesian method using a Gaussian Process \
(GP) prior. The STK also provides tools for the sequential and \
non-sequential design of experiments. Even though it is, currently, mostly \
geared towards the Design and Analysis of Computer Experiments (DACE), the \
STK can be useful for other applications areas (such as Geostatistics, \
Machine Learning, Non-parametric Regression, etc.). \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "octave-forge-stk-2.8.1-2.5.aarch64.rpm"
RPM_HASH = "2bd51036b92e7dae9eb3339b49a7f6bb5f061a7cd44f2a1357209c691e8ce09827ec7aef62e8c8946135dc30dcf53ac67cbb776286514d8f4fdb91fe5af68d1f"

RPROVIDES:${PN} += "octave-forge-stk"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
liboctmex.so.1 \
octave-cli"

inherit rpm
