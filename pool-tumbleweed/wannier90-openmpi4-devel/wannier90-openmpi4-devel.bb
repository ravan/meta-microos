SUMMARY = "Library for generating Wannier functions - headers and development files"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy. \
 \
This package provides files needed for developing against wannier90."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "wannier90-openmpi4-devel-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "6e374be6214c2562f05f7235443ad4b1e2e3a0d18da59adf076f6e9c0d761a46c3c8374bf9cdeeb100f1340136813b730146c4f36f48e2513a0db89679362bc5"

RPROVIDES:${PN} += "wannier90-openmpi4-devel"

RDEPENDS:${PN} += ""

inherit rpm
