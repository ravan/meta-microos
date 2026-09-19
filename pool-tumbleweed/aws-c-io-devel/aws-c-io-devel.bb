SUMMARY = "Development files for aws-c-io library"
DESCRIPTION = "This is a module for the AWS SDK for C. It handles all I/O \
and TLS work for application protocols. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.27.7"

RPM_NAME = "aws-c-io-devel-0.27.7-1.1.aarch64.rpm"
RPM_HASH = "662e203b378c509f1efae0ae4f837daad2904ef9f2c79259ad6b0073309669ff947885876aea3eb2b4e724fa57e666ec2e395086a370fcb4d31477f97e9a9718"

RPROVIDES:${PN} += "aws-c-io-devel \
cmake-aws-c-io"

RDEPENDS:${PN} += "libaws-c-io0unstable"

inherit rpm
