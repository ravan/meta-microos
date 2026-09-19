SUMMARY = "Kubernetes control plane certificate auto rotation"
DESCRIPTION = "A Kubernetes daemonset to perform automatic control plane certificate rotation."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "kucero-1.6.2-1.19.aarch64.rpm"
RPM_HASH = "95a0030714ea1fb5bb8b98da6c3124f95c65314d7f41d9248dde0f23b81447ccdd1bbb2997319f7b2a1cb43af0f58166371828b4013c59435c2984b2e6b1ea98"

RPROVIDES:${PN} += "kucero"

RDEPENDS:${PN} += ""

inherit rpm
