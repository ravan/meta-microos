SUMMARY = "Contrib scripts for Neomutt"
DESCRIPTION = "Examples, scripts and helpers that are distributed with Neomutt but are not \
maintained by the Neomutt authors."
LICENSE = "GPL-2.0-or-later"

PV = "20260406"

RPM_NAME = "neomutt-contrib-20260406-1.4.noarch.rpm"
RPM_HASH = "fcf749446eb7a11e9df2cb0754a1cdd73916da557e0b22cb0146b9cdfbb0490856ee20d3e6737196829be0f28dc63d85d1af98e891de40134a774b8aa53227fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-contrib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
neomutt"

inherit rpm
