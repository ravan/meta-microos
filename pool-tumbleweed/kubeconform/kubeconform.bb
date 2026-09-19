SUMMARY = "A fast Kubernetes manifests validator, with support for custom resources"
DESCRIPTION = "Kubeconform is a Kubernetes manifests validation tool. It is inspired by, contains \
code from and is designed to stay close to Kubeval, but with the following \
improvements: \
 \
- high performance: will validate & download manifests over multiple routines, caching \
  downloaded files in memory \
- configurable list of remote, or local schemas locations, enabling validating Kubernetes \
  custom resources (CRDs) and offline validation capabilities \
- uses by default a self-updating fork of the schemas registry maintained by the \
  kubernetes-json-schema project - which guarantees up-to-date schemas for all recent versions \
  of Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "kubeconform-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "c07952acaf3097145d79c182bc5da7a29019b1c726ad2036df51807c4f409e832e85aceeb6ed487f10ab0e4eba0146f52da6963a794d253785da58d99dd0fb7b"

RPROVIDES:${PN} += "kubeconform"

RDEPENDS:${PN} += ""

inherit rpm
