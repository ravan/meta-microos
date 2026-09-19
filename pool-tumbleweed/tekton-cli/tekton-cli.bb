SUMMARY = "CLI for interacting with the Tekton CD system"
DESCRIPTION = "The Tekton Pipelines CLI project provides a command-line interface (CLI) for \
interacting with Tekton, an open-source framework for Continuous Integration \
and Delivery (CI/CD) systems."
LICENSE = "Apache-2.0"

PV = "0.46.0"

RPM_NAME = "tekton-cli-0.46.0-1.1.aarch64.rpm"
RPM_HASH = "d49efcf0b7a3399607f0f4e5fb31102b61c661770f69cb617b1e1d868bfff6a18c765898edb161f1d809b6f2727a7b0702da7fa6b65fe44875a333465159faf1"

RPROVIDES:${PN} += "tekton-cli \
tkn"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
