SUMMARY = "Stressful application test"
DESCRIPTION = "Stressful Application Test (or stressapptest, its unix name) tries to maximize \
randomized traffic to memory from processor and I/O, with the intent of \
creating a realistic high load situation in order to test the existing \
hardware devices in a computer."
LICENSE = "Apache-2.0"

PV = "1.0.11"

RPM_NAME = "stressapptest-1.0.11-2.8.aarch64.rpm"
RPM_HASH = "fafe0d027aa44a0e0f953d4e1b50b4bfadaf45f2ea9fa21e0d0c822ecb7a0e8ae42a8bbff9b678fbe163e13b8c195555ef6280530b40b108399de6328ca9ad93"

RPROVIDES:${PN} += "stressapptest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
