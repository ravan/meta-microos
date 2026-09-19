SUMMARY = "Compel library for CRIU"
DESCRIPTION = "This package contains the compel library for CRIU to execute a parasite code."
LICENSE = "LGPL-2.1-only"

PV = "4.2.1"

RPM_NAME = "libcompel1-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "532049854c501b7effa55b3a4cf06dc86a3010bb648dd818d6733dae41440d0fbcc76ff9f6bcf552583dbc7f432458f03b19c0a6e8fd6461f4f935a236ae7404"

RPROVIDES:${PN} += "libcompel.so.1 \
libcompel1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
