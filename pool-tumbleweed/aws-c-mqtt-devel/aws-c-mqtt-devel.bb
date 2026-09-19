SUMMARY = "Development files for aws-c-mqtt library"
DESCRIPTION = "AWS C99 implementation of the MQTT 3.1.1 specification. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.16.2"

RPM_NAME = "aws-c-mqtt-devel-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "a1b423e0b78944d98bd68df1ac5317b8996f217fa5ccc81d576f7f44727597aad9ccfde8afa20a0540456f7241182be38d79d05af9384dc88690b2cb75d50d62"

RPROVIDES:${PN} += "aws-c-mqtt-devel \
cmake-aws-c-mqtt"

RDEPENDS:${PN} += "libaws-c-mqtt1-0-0"

inherit rpm
