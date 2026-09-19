SUMMARY = "AWS C++ wrapper for AWS SDK C libraries - development files"
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
This package contains development files."
LICENSE = "Apache-2.0"

PV = "0.43.6"

RPM_NAME = "aws-crt-cpp-devel-0.43.6-1.1.aarch64.rpm"
RPM_HASH = "5af4d041d7c3f43f9d1612a55f0747b90f3146e855c5d59524bcda0c5488af5646573e6ad3c43e0b7cbb68158709016ac5d0fee5745ea893dc85e8645aed3a8c"

RPROVIDES:${PN} += "aws-crt-cpp-devel \
cmake-aws-crt-cpp"

RDEPENDS:${PN} += "libaws-crt-cpp1"

inherit rpm
