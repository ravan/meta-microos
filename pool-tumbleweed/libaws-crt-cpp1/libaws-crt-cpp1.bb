SUMMARY = "AWS C++ wrapper for AWS SDK C libraries"
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
This package contains the shared libraries."
LICENSE = "Apache-2.0"

PV = "0.43.6"

RPM_NAME = "libaws-crt-cpp1-0.43.6-1.1.aarch64.rpm"
RPM_HASH = "48c1c632b28d5a73a2876c3363a2bd296c2e0aef4ec7984e06bfd8169f180d68ffac8f547376c1ba1765ac61171334d1715b7b4494fb12ff21e0a69982f07b9c"

RPROVIDES:${PN} += "libaws-crt-cpp.so.1 \
libaws-crt-cpp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-auth.so.1.0.0 \
libaws-c-cal.so.0unstable \
libaws-c-common.so.1 \
libaws-c-event-stream.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libaws-c-mqtt.so.1.0.0 \
libaws-c-s3.so.0unstable \
libaws-c-sdkutils.so.1.0.0 \
libaws-checksums.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
