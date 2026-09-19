SUMMARY = "CLI for Flux2CD"
DESCRIPTION = "Flux is a tool for keeping Kubernetes clusters in sync with sources of \
configuration (like Git repositories and OCI artifacts), and automating updates \
to configuration when there is new code to deploy. \
 \
Flux version 2 ('v2') is built from the ground up to use Kubernetes' API \
extension system, and to integrate with Prometheus and other core components of \
the Kubernetes ecosystem. In version 2, Flux supports multi-tenancy and support \
for syncing an arbitrary number of Git repositories, among other long-requested \
features. \
 \
Flux v2 is constructed with the GitOps Toolkit, a set of composable APIs and \
specialized tools for building Continuous Delivery on top of Kubernetes. \
 \
Flux is a Cloud Native Computing Foundation (CNCF) project, used in production \
by various organisations and cloud providers."
LICENSE = "Apache-2.0"

PV = "2.9.4"

RPM_NAME = "flux2-cli-2.9.4-1.1.aarch64.rpm"
RPM_HASH = "edd05a4d8a9fa0bcfd1d0b5fbe6fed6cb5165bca494f7d99223c2a1494112297679cb955c3801245a5428e8c2d35b58a40bd0b4e7e47b48b604725d657fb4c1b"

RPROVIDES:${PN} += "flux2-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
