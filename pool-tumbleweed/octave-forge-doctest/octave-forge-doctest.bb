SUMMARY = "Octave-Forge documentation tests"
DESCRIPTION = "The Octave-Forge Doctest package finds specially-formatted blocks of example \
code within documentation files. It then executes the code and confirms \
the output is correct. This can be useful as part of a testing framework \
or simply to ensure that documentation stays up-to-date during software development. \
This is part of Octave-Forge project."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "octave-forge-doctest-0.8.0-1.12.noarch.rpm"
RPM_HASH = "fbf93d87791e3471e714bf47c3867927b00f0bc7f4eff548e00bbcabcc6454c077fd24c17d7991133836417c5dfa66b808fb08adccb19fa1c01ad8958e856b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-doctest"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
