SUMMARY = "Support library for utilities from the Schily toolbox"
DESCRIPTION = "libschily contains many OS abstraction functions used by the Schily \
tools."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libschily2_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "00a3326c193398f818f7f2f6bb8d9bfd7adc0d60e83ed169c9bdac2b6d8d4188ab4f31d356b1f1fe4c8303d44cb499b7158cfe022c40b9a1ac7bf099f3645d26"

RPROVIDES:${PN} += "libschily.so.2.0 \
libschily2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
