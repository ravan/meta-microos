SUMMARY = "Branding for velum"
DESCRIPTION = "kubic branding themes for velum"
LICENSE = "Apache-2.0"

PV = "0.0.0+git_r22_fe3c5d0"

RPM_NAME = "velum-branding-0.0.0+git_r22_fe3c5d0-3.19.aarch64.rpm"
RPM_HASH = "4ec67126da0a55d0034b06facac372fd328c18309e6f4ba8d0c6ea893765f027e332121a6e9cbed93230e47a56c7f7c3b29c784cf32aeeadf086590c8a93deb1"

RPROVIDES:${PN} += "velum-branding"

RDEPENDS:${PN} += ""

inherit rpm
