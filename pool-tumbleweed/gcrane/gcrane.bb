SUMMARY = "GCR-specific variant of crane"
DESCRIPTION = "crane is a GCR-specific variant of crane that has richer output for the ls \
subcommand and some basic garbage collection support."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "gcrane-0.22.1-1.1.aarch64.rpm"
RPM_HASH = "0f38227a15196ea74e26504ffaf6977980a3c53f323e6e4e75125a2a81057396f6b6a7cf6911751c7d5245529ea53dd18f284535c0cf1a5a2057e1aae57af8de"

RPROVIDES:${PN} += "gcrane"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
