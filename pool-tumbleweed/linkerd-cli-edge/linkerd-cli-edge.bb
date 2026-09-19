SUMMARY = "CLI for the linkerd service mesh for Kubernetes"
DESCRIPTION = "The Linkerd CLI is the primary way to interact with Linkerd. It can install the \
control plane to your cluster, add the proxy to your service and provide \
detailed metrics for how your service is performing. \
 \
Linkerd is an ultralight, security-first service mesh for Kubernetes. Linkerd \
adds critical security, observability, and reliability features to your \
Kubernetes stack with no code change required. \
 \
Linkerd is a Cloud Native Computing Foundation (CNCF) project."
LICENSE = "Apache-2.0"

PV = "26.8.4"

RPM_NAME = "linkerd-cli-edge-26.8.4-1.1.aarch64.rpm"
RPM_HASH = "14b75df91eb70c0fba53a9e903e687cab826041e0359847b8ab10dcff8d6f631b4b36c3990a112cc970ba7301bc2dcbf44d58534d82f2d99e37623d169ccfae9"

RPROVIDES:${PN} += "linkerd-cli-edge"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
