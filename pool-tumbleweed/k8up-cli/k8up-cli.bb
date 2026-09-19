SUMMARY = "CLI for the K8up Kubernetes and OpenShift Backup Operator"
DESCRIPTION = "K8up is a Kubernetes backup operator based on Restic that will handle PVC and \
application backups on a Kubernetes or OpenShift cluster. \
 \
Just create a schedule and a credentials object in the namespace you’d like to \
backup. It’s that easy. K8up takes care of the rest. It also provides a \
Prometheus endpoint for monitoring. \
 \
K8up is production ready. It is used in production deployments since 2019. \
 \
This package contains the CLI."
LICENSE = "Apache-2.0"

PV = "2.16.0"

RPM_NAME = "k8up-cli-2.16.0-1.2.aarch64.rpm"
RPM_HASH = "8843a5be1c8443617fe9bbb14217f2028a889c92b2a45f78995204b913e99699a168a81d8cd4dfb98db984cd9429df3b57e1ed068e935b7e3d192ce6c0ebcbcf"

RPROVIDES:${PN} += "k8up-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
