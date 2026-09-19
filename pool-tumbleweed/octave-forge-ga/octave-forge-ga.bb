SUMMARY = "Genetic optimization code for Octave"
DESCRIPTION = "Genetic optimization code. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.4"

RPM_NAME = "octave-forge-ga-0.10.4-1.9.noarch.rpm"
RPM_HASH = "e9f2a315bb747599ca54b5440866ae45fa83ae6ae3429fad0716db4f80572c5cf5ab3e094d32ebde4a2f4cb246137c3027cbde3bc08f2453df20521d64029753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-ga"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
