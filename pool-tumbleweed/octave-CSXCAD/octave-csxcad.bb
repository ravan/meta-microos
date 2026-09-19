SUMMARY = "Octave interface for openEMS"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package provides Octave interface for CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "octave-CSXCAD-0.6.3-5.1.noarch.rpm"
RPM_HASH = "409bc771b7355c085f3da62cdd1096d7a088f5ace7a805fba45bfc2730fe8863167b82e599cf15b44c23ff52f4a8cfb9c05e4f4d6827c3b6bad04fd1c7db5e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-CSXCAD"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
