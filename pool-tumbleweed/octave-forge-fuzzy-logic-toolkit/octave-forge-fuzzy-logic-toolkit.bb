SUMMARY = "Fuzzy logic toolkit for Octave"
DESCRIPTION = "A mostly MATLAB-compatible fuzzy logic toolkit. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "octave-forge-fuzzy-logic-toolkit-0.6.2-2.3.noarch.rpm"
RPM_HASH = "030a683b7230fee8d6b8c947c7467e195cad06f8c92c2a18429a47f66272d9a75d1187f712672f8a2a9a1ddba1fb0f37b10d8c96e3593ebad016dd50015c825f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-fuzzy-logic-toolkit"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
