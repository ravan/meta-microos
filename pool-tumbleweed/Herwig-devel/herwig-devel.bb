SUMMARY = "Multi purpose event generator for high energy physics"
DESCRIPTION = "Herwig is a multi-purpose particle physics event generator. \
Herwig 7.0 (Herwig++ 3.0) replaces any prior HERWIG or Herwig++ versions. \
 \
Herwig features coherent parton showers (including angular-ordered \
and dipole-based evolution), the cluster hadronization model, an \
eikonal multiple-interaction model, highly flexible BSM capabilities \
and improved perturbative input using next-to-leading order QCD. \
 \
Herwig is based on ThePEG. \
 \
This package provides the header and source libraries for development \
with Herwig."
LICENSE = "GPL-2.0-only"

PV = "7.3.0"

RPM_NAME = "Herwig-devel-7.3.0-2.4.aarch64.rpm"
RPM_HASH = "0b2ca70aa372554973301ae5dcef8f762fbd248284e88a1aea212ed3a2b5971b0e03fa36319aa21bbadea65942bc0606b2bc068f80d041c09bd71fdcbcc50103"

RPROVIDES:${PN} += "Herwig++-devel \
Herwig-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
Herwig-libs \
ThePEG-devel \
ld-linux-aarch64.so.1 \
libHerwigAPI.so.2 \
libThePEG.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
