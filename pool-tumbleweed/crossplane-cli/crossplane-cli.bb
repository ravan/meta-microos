SUMMARY = "The Cloud Native Control Plane"
DESCRIPTION = "Crossplane is a framework for building cloud native control planes without \
needing to write code. It has a highly extensible backend that enables you to \
build a control plane that can orchestrate applications and infrastructure no \
matter where they run, and a highly configurable frontend that puts you in \
control of the schema of the declarative API it offers. \
 \
The Crossplane CLI is a command-line tool for working with Crossplane. It \
provides tools for building platforms on top of Crossplane and working with \
Crossplane clusters."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "crossplane-cli-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "0b9fd27cdad108521ae3dd07ec593ec68f0ca8a976df7663cc4df9f0d9b1e0bd4c3469e1317c9cb6d9f766eb7738444873e2c3f47e327ddf5581c757da24e9a1"

RPROVIDES:${PN} += "crossplane \
crossplane-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
