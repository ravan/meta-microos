SUMMARY = "Library for generating Wannier functions - headers and development files"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy. \
 \
This package provides files needed for developing against wannier90."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "wannier90-openmpi5-devel-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "bbcca10f9cd03cce4684a36e917518b66f7b54cca3057570044188e02d66a3f25d4f1a2c6fb1b632f6691299169de5ab66504f1ddeffff20b6a38fee31953b05"

RPROVIDES:${PN} += "wannier90-openmpi5-devel"

RDEPENDS:${PN} += ""

inherit rpm
