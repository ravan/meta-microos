SUMMARY = "Kubernetes IN Docker - local clusters for testing Kubernetes"
DESCRIPTION = "kind is a tool for running local Kubernetes clusters using Docker container \
'nodes'. kind was primarily designed for testing Kubernetes itself, but may be \
used for local development or CI."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "kind-0.33.0-1.1.aarch64.rpm"
RPM_HASH = "e2f9f2054924cf1d42b58ea79bff17d0b568a59f96f619a5b2b0fa981c4439f27db7028cdd6ddd121a0bbd1e4f9c60cc7109d04972ddaca54572297f59ea7f80"

RPROVIDES:${PN} += "kind"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
