SUMMARY = "Development files for aws-c-event-stream library"
DESCRIPTION = "C99 implementation of the vnd.amazon.eventstream content-type. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.7.2"

RPM_NAME = "aws-c-event-stream-devel-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "7b56ccb8a365cff33257d13837d238f4ca6ee038bec0b720f1afed812d6109e2775f3a5a7a69ac31b545112ffc7995e83b05b63c28e4b83eda7cb3490ad4c5dc"

RPROVIDES:${PN} += "aws-c-event-stream-devel \
cmake-aws-c-event-stream"

RDEPENDS:${PN} += "libaws-c-event-stream1"

inherit rpm
