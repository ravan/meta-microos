SUMMARY = "Development headers for NodeJS 26.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "26.7.0"

RPM_NAME = "nodejs26-devel-26.7.0-1.1.aarch64.rpm"
RPM_HASH = "5e8fb48585920ebf854070e050b56c2bb27a9542369ef832a8eb9f0b1c94bf1c31b95be20e856162a7c4fe1a7275d6ee1f5d4826b91ff797abb058ce7803eeed"

RPROVIDES:${PN} += "nodejs-devel \
nodejs26-devel"

RDEPENDS:${PN} += "nodejs26 \
npm26"

inherit rpm
