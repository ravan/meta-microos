SUMMARY = "SEmi Conductor Simulator in 3D for Octave"
DESCRIPTION = "A Drift-Diffusion simulator for 3D semiconductor devices. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "0.0.1"

RPM_NAME = "octave-forge-secs3d-0.0.1-1.30.noarch.rpm"
RPM_HASH = "5ebd7ac3b489b307a3a7e8469e69048787135157a7982956176212a5ecf15955ce9e030289c15bc905d59a0749c213bd132f5e503a9cb92e59f44f88041703c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-secs3d"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-bim \
octave-forge-fpl"

inherit rpm
