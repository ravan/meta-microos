SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "6.0.2"

RPM_NAME = "podman-remote-6.0.2-1.1.aarch64.rpm"
RPM_HASH = "78f141c028259a74d16821c1b970cf2d7a6bf13942eeb21aa43eea034823cd17eebc3e679cf90eeef093801366d68d0cf3119338269d95c911fa65b9526637a9"

RPROVIDES:${PN} += "podman-/usr/bin/podman-remote \
podman-remote"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
