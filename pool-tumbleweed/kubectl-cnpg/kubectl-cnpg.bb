SUMMARY = "Manage PostgreSQL clusters built using CloudNativePG"
DESCRIPTION = "CloudNativePG provides a plugin for kubectl to manage a cluster in Kubernetes. \
 \
Documentation is at: \
https://cloudnative-pg.io/docs"
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "kubectl-cnpg-1.29.2-1.3.aarch64.rpm"
RPM_HASH = "24737cd5b58eadf95ddca8fa677097494c4bcf03afcea06a712741fe737627117746802a3b87c20e964c80c32dad55b39de3f4231a2a29d6d326ab1e65562b50"

RPROVIDES:${PN} += "kubectl-cnpg"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
