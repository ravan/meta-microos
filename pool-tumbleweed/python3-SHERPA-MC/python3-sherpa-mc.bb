SUMMARY = "Python extensions for SHERPA-MC"
DESCRIPTION = "Sherpa is a Monte Carlo event generator for the Simulation of \
High-Energy Reactions of PArticles in lepton-lepton, lepton-photon, \
photon-photon, lepton-hadron and hadron-hadron collisions. It provides \
complete hadronic final states in simulations of high-energy particle \
collisions. The produced events may be passed into detector \
simulations used by the various experiments. The entire code has been \
written in C++. \
 \
This package provides the python extensions for Sherpa."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.16"

RPM_NAME = "python3-SHERPA-MC-2.2.16-1.5.aarch64.rpm"
RPM_HASH = "f14ea776d1231d2227c3fe15bc2ffb06aa8e45a91426b8536a841ac46c22e0ca4a9eeb1cea09f3f0d3dbfdb382b9f573397c51dd8413d759a8a577e1d36043a7"

RPROVIDES:${PN} += "python-SHERPA-MC \
python3-SHERPA-MC"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libMEProcess.so.0 \
libSherpaMain.so.0 \
libToolsMath.so.0 \
libToolsOrg.so.0 \
libToolsPhys.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
