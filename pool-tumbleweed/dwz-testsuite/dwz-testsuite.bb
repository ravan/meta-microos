SUMMARY = "Testsuite results from DWZ"
DESCRIPTION = "This package contains the testsuite results from DWZ."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "dwz-testsuite-0.15-6.8.aarch64.rpm"
RPM_HASH = "cf6a13481d0729e8bf6d3903e32e202a6b11507d7882f7da47dcee8aa49686745d79a7906149c8c25ca83519097cefbd7228399765bd8f01534cd179dbc49e3a"

RPROVIDES:${PN} += "dwz-testsuite"

RDEPENDS:${PN} += ""

inherit rpm
