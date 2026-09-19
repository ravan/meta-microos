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

PV = "2.20"

RPM_NAME = "linkerd-cli-2.20-1.3.aarch64.rpm"
RPM_HASH = "079d615da2846dce37af82665f27111a302fe1b08e3537c05859be20cabe70acdd40e12083b0eeedaa40a0a8dbe8498794918ed7c63874853fbd1e48009f37b8"

RPROVIDES:${PN} += "linkerd-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
