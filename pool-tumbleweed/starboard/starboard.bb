SUMMARY = "Kubernetes-native security toolkit"
DESCRIPTION = "Starboard integrates security tools into the Kubernetes environment, so that \
users can find and view the risks that relate to different resources in a \
Kubernetes-native way. Starboard provides custom resources definitions and a Go \
module to work with a range of existing security scanners, as well as a \
kubectl-compatible command, the Octant plugin, and the Lens extension that make \
security reports available through familiar Kubernetes tools."
LICENSE = "Apache-2.0"

PV = "0.15.38"

RPM_NAME = "starboard-0.15.38-1.4.aarch64.rpm"
RPM_HASH = "cfb328346bd7b464b3069dc19374c960873c3c6e3f74e2fe2071b56e264b9d92a9d1f8099a333b2a296c493107dbd727a80e106957b62a31a84f32149d00385e"

RPROVIDES:${PN} += "starboard"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
