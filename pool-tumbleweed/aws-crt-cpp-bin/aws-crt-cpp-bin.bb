SUMMARY = "AWS C++ wrapper for AWS SDK C libraries - application binaries"
DESCRIPTION = "AWS C++ wrapper for the following AWS SDK C libraries \
 \
 * aws-c-common: Cross-platform primitives and data structures. \
 * aws-c-io: Cross-platform event-loops, non-blocking I/O, and TLS implementations. \
 * aws-c-mqtt: MQTT client. \
 * aws-c-auth: Auth signers such as Aws-auth sigv4 \
 * aws-c-http: HTTP 1.1 client, and websockets (H2 coming soon) \
 * aws-checksums: Cross-Platform HW accelerated CRC32c and CRC32 with fallback to efficient SW implementations. \
 * aws-c-event-stream: C99 implementation of the vnd.amazon.event-stream content-type. \
 \
This package contains application binaries."
LICENSE = "Apache-2.0"

PV = "0.43.6"

RPM_NAME = "aws-crt-cpp-bin-0.43.6-1.1.aarch64.rpm"
RPM_HASH = "609bc8ac3a0d8bb1dfaf389fac9ffe6ea9ca5f341cc0e0cd71d95dde06c64edf9285d2e157c096bbc7ed21a3f6d87659e16170a3e52ed9991eea8b4d84eaef02"

RPROVIDES:${PN} += "aws-crt-cpp-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libaws-c-io.so.0unstable \
libaws-crt-cpp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
