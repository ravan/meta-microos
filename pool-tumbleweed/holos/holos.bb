SUMMARY = "Kubernetes configuration management implementing the rendered manifests pattern"
DESCRIPTION = "Holos is a configuration management tool for Kubernetes implementing the \
rendered manifests pattern. It handles configurations ranging from single \
resources to multi-cluster platforms across regions. \
 \
Key components: \
 \
- Platform schemas defining component integration \
- Building blocks unifying Helm, Kustomize and Kubernetes configs with CUE \
- BuildPlan pipeline for generating, transforming and validating manifests"
LICENSE = "Apache-2.0"

PV = "0.106.0"

RPM_NAME = "holos-0.106.0-1.6.aarch64.rpm"
RPM_HASH = "8452fbf5c75c3b72f7ed90723cfe25a958388b31dcf840eb889e8aea684a586623238203b6a8950ced2eed0522e1cd023e38f561e232ef3dcde266c2aaa8b91c"

RPROVIDES:${PN} += "holos"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
