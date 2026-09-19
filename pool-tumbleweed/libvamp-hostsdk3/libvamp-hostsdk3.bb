SUMMARY = "Library for Vamp audio analysis plugin hosts"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "libvamp-hostsdk3-2.10.0-1.24.aarch64.rpm"
RPM_HASH = "a8caeb4704c498316c4ef37521e2a3e9d8600c9feef742d825fb5d6046514b31c5c5b431cca2b329374766e44119d2515916b1cda1fcfd6f3adf70796346819b"

RPROVIDES:${PN} += "libvamp-hostsdk.so.3 \
libvamp-hostsdk3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
