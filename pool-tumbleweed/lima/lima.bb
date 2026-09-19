SUMMARY = "Linux virtual machines, with a focus on running containers"
DESCRIPTION = "Linux virtual machines, with a focus on running containers."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "lima-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "c10eb4647358a41e2c014d8a5b0e8248a61bf302728ff731d65ab5b4fe9d50484863aa84908bdd2a10c075d8f9853de926af525cd2e47c321bc9c12e1e8bddbc"

RPROVIDES:${PN} += "lima"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
qemu"

inherit rpm
