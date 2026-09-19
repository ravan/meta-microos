SUMMARY = "3D graphics using VRML for Octave"
DESCRIPTION = "3D graphics using VRML. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.14"

RPM_NAME = "octave-forge-vrml-1.0.14-1.6.noarch.rpm"
RPM_HASH = "caaca90d5e81ab67b5e9576a76a92ace61aeb1d0f32599c0aff03f26017bac9b0541829aeae6c5999e40f55db4c5ba4f9b1537cebccbbd7552d90152a9c15878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-vrml"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-linear-algebra \
octave-forge-miscellaneous \
octave-forge-statistics \
octave-forge-struct"

inherit rpm
