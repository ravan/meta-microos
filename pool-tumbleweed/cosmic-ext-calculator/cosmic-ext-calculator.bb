SUMMARY = "A simple calculator for the COSMIC desktop"
DESCRIPTION = "A simple calculator for the COSMIC desktop."
LICENSE = "GPL-3.0-only"

PV = "0.2.1"

RPM_NAME = "cosmic-ext-calculator-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "e5481c2bed4595596176602dffcee4cc1c8cc50a2ab32cd682719f2bf69229d9a4b58f6ca469329be3bbfa8a9fe170d479591010f34d00672fb3b3413d3de2b4"

RPROVIDES:${PN} += "cosmic-ext-calculator"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0 \
qalculate"

inherit rpm
