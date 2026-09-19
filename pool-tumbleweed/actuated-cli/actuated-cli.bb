SUMMARY = "CLI for actuated"
DESCRIPTION = "CLI for actuated, which brings 'blazingly fast, secure builds to self-hosted CI \
runners'."
LICENSE = "MIT"

PV = "0.2.16"

RPM_NAME = "actuated-cli-0.2.16-1.1.aarch64.rpm"
RPM_HASH = "78aa391dd80689e4794fd70cd56c10a87c4e8e09cebe7b25c4020c34d0d4180d18e81a73b5b94541483f325b92442734b862b763b0d2c2e218e86286b664501a"

RPROVIDES:${PN} += "actuated-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
