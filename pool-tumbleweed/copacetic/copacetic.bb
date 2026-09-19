SUMMARY = "CLI tool for directly patching container images using reports from vulnerability scanners"
DESCRIPTION = "copa is a CLI tool written in Go and based on buildkit that can be used to \
directly patch container images given the vulnerability scanning results from \
popular tools like Trivy."
LICENSE = "Apache-2.0"

PV = "0.14.2"

RPM_NAME = "copacetic-0.14.2-1.2.aarch64.rpm"
RPM_HASH = "f6fe39a15f0e3c38fa20cf51a3bad82706f3c24fcbf2a110a4d032803235a40563acb68c77ce1c00cf8f1e4a753588aaf64fc831b508ad87238cdb688f4c0363"

RPROVIDES:${PN} += "copacetic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
