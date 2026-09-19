SUMMARY = "CLI for the Retina Kubernetes network observability platform"
DESCRIPTION = "Retina is a cloud-agnostic, open-source Kubernetes network observability \
platform that provides a centralized hub for monitoring application health, \
network health, and security. It provides actionable insights to cluster \
network administrators, cluster security administrators, and DevOps engineers \
navigating DevOps, SecOps, and compliance use cases. \
 \
Retina collects customizable telemetry, which can be exported to multiple \
storage options (such as Prometheus, Azure Monitor, and other vendors) and \
visualized in a variety of ways (like Grafana, Azure Log Analytics, and other \
vendors). \
 \
This package contains the CLI to interact with the platform."
LICENSE = "Apache-2.0"

PV = "0.0.16"

RPM_NAME = "kubectl-retina-0.0.16-1.13.aarch64.rpm"
RPM_HASH = "846da3fa5c659dd5502b5d783d44c2e7ec6f59d20d5f34fa0e2580f12e06b361b0b1a4c115590d8e35bd2d7fbb71aa93e453485f5b541b6bae62c1e0ff15cc3b"

RPROVIDES:${PN} += "kubectl-retina"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
