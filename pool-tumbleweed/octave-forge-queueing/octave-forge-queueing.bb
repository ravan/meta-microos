SUMMARY = "Queueing Networks and Markov chains analysis for Octave"
DESCRIPTION = "Functions for queueing networks and Markov chains analysis. \
This package can be used to compute steady-state performance measures \
for open, closed and mixed networks with single or multiple job classes. \
Mean Value Analysis (MVA), convolution, and various bounding techniques are \
implemented. Furthermore, several transient and steady-state performance \
measures for Markov chains can be computed, such as state occupancy \
probabilities, mean time to absorption, time-averaged sojourn times \
and so forth. Discrete- and continuous-time Markov chains are supported. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "octave-forge-queueing-1.2.8-2.3.noarch.rpm"
RPM_HASH = "5d6ee5bd20c4f0a1252dde6a02c944caac92f5a746eb79ea5c0a190208ad9832822756a0020ca2b5bb4bb40148572dfaa3704a13adf67d0c4a45a0d2776a367d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-queueing"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
