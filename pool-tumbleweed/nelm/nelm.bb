SUMMARY = "Helm 3 alternative"
DESCRIPTION = "Nelm is a Helm 3 alternative. It is a Kubernetes deployment tool that manages \
Helm Charts and deploys them to Kubernetes and also is the deployment engine of \
werf. It can do (almost) everything that Helm does, but better, and even quite \
some on top of it. Nelm is based on improved and partially rewritten Helm 3 \
codebase, to introduce: \
 \
* terraform plan-like capabilities; \
* replacement of 3-Way Merge with Server-Side Apply; \
* secrets management; \
* advanced resource ordering capabilities; \
* improved resource state/error tracking; \
* continuous printing of logs, events, resource statuses and errors during \
  deploy; \
* lots of fixes for Helm 3 bugs, e.g. 'no matches for kind Deployment in \
  version apps/v1beta1'; \
* ... and more."
LICENSE = "Apache-2.0"

PV = "1.25.3"

RPM_NAME = "nelm-1.25.3-1.2.aarch64.rpm"
RPM_HASH = "862b7874b4677ea8b090bac0bb2251af9b400a66b882816e03eb15364181c0ede7988868b76b14d8082d1cbc53d0d7808596b4899e7478161755ed96d2c77878"

RPROVIDES:${PN} += "nelm"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
