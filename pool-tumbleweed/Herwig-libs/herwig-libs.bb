SUMMARY = "Multi purpose event generator for high energy physics"
DESCRIPTION = "Herwig is a multi-purpose particle physics event generator. \
 \
Herwig features coherent parton showers (including angular-ordered \
and dipole-based evolution), the cluster hadronization model, an \
eikonal multiple-interaction model, highly flexible BSM capabilities \
and improved perturbative input using next-to-leading order QCD. \
 \
Herwig is based on ThePEG. \
 \
This package provides the shared libraries for Herwig."
LICENSE = "GPL-2.0-only"

PV = "7.3.0"

RPM_NAME = "Herwig-libs-7.3.0-2.4.aarch64.rpm"
RPM_HASH = "5e68ab0c1a59eecb56cd1a4fd1fa516208288ed5e018b07b2c8e726ac59ab03a5eb2e26ddd73bf908d845f9ecdaa3dd93d127613091efec656e9f614dac2afc6"

RPROVIDES:${PN} += "Herwig-libs \
config-Herwig-libs \
libHerwigAPI.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libThePEG.so.30 \
libc.so.6 \
libfastjet.so.0 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgmp.so.10 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
