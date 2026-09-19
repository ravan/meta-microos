SUMMARY = "Examples for Paraview"
DESCRIPTION = "ParaView is an application for visualizing large data sets. \
 \
ParaView runs on distributed and shared memory systems alike. It uses the \
Visualization Toolkit as the data processing and rendering engine, and has a \
user interface written using a blend of Tcl/Tk and C++. \
 \
This package contains some example data for Paraview."
LICENSE = "BSD-3-Clause"

PV = "5.11.2"

RPM_NAME = "paraviewdata-5.11.2-1.9.noarch.rpm"
RPM_HASH = "6e3b5e8abe5f13af38b2bce7857347672ea57e7adc2b8d1bcbc511448345814def25e868718a636ab3e4e20ed4f09e6705e088c7aab54bca3cc8efc454518b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paraviewdata"

RDEPENDS:${PN} += ""

inherit rpm
