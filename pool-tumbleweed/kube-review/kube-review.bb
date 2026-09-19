SUMMARY = "Create Kubernetes AdmissionReview requests from manifests"
DESCRIPTION = "Simple command line utility to transform a provided Kubernetes resource into a \
Kubernetes AdmissionReview request, as sent from the Kubernetes API server when \
dynamic admission control (i.e. webhook) is configured."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "kube-review-0.5.0-1.9.aarch64.rpm"
RPM_HASH = "c27276e86963455369a0d306848b27f94090eaba778ee05f5f7be637285cc1c5b0b51cfe74cbf0a2aa001a1938e648baa2d9fea3c12f03124670a788c85bcf8f"

RPROVIDES:${PN} += "kube-review"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
