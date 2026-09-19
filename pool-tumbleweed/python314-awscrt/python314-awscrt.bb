SUMMARY = "A common runtime for AWS Python projects"
DESCRIPTION = "A common runtime for AWS Python projects"
LICENSE = "Apache-2.0"

PV = "0.36.2"

RPM_NAME = "python314-awscrt-0.36.2-1.1.aarch64.rpm"
RPM_HASH = "563e6fdfec518a433e8891da53975ad94545780b4b442aba33eb8f7b8fabb7616e7f933f7d2456abc21da23938013017ce711fdce4e892a90b2d6b16745123cc"

RPROVIDES:${PN} += "python3.14dist-awscrt \
python314-awscrt \
python3dist-awscrt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaws-c-auth.so.1.0.0 \
libaws-c-cal.so.0unstable \
libaws-c-common.so.1 \
libaws-c-event-stream.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libaws-c-mqtt.so.1.0.0 \
libaws-c-s3.so.0unstable \
libaws-checksums.so.1 \
libc.so.6 \
python-abi"

inherit rpm
