SUMMARY = "Development files for libformfactor"
DESCRIPTION = "Efficient computation of scattering form factors (Fourier shape transforms) of \
arbitrary polyhedra according to Wuttke, J Appl Cryst 54, 580-587 (2021). \
 \
This package contains the files needed to build with libformfactor."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "libformfactor-devel-0.3.2-1.4.aarch64.rpm"
RPM_HASH = "13ef55b684cbee4f2c27848edc2b210e126cf654001fffd84cafdd4f6cd4955f2f7341dbca6d0f47ed7ff1ef58738dadd5102c3feb0c13621b4623e7d3bca10f"

RPROVIDES:${PN} += "cmake-formfactor \
libformfactor-devel"

RDEPENDS:${PN} += "libformfactor0-3-2"

inherit rpm
