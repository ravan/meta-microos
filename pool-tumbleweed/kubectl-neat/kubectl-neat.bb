SUMMARY = "Clean up Kubernetes yaml and json output to make it readable"
DESCRIPTION = "Remove clutter from Kubernetes manifests to make them more readable."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "kubectl-neat-2.0.4-1.14.aarch64.rpm"
RPM_HASH = "e113f9ddf095cf66a05c779bdfd7903f1d94dd9b042ba822c5b1d5b26cb723028e7a8a245777f9feb46facba8e4093ffa90e5d969ca2d029c0b5f4f4673c6193"

RPROVIDES:${PN} += "kubectl-neat"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
