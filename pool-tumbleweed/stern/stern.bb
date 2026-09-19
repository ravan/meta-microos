SUMMARY = "Multi pod and container log tailing for Kubernetes"
DESCRIPTION = "Stern allows you to tail multiple pods on Kubernetes and multiple containers \
within the pod. Each result is color coded for quicker debugging. \
 \
The query is a regular expression so the pod name can easily be filtered and \
you don't need to specify the exact id (for instance omitting the deployment \
id). If a pod is deleted it gets removed from tail and if a new pod is added it \
automatically gets tailed. \
 \
When a pod contains multiple containers Stern can tail all of them too without \
having to do this manually for each one. Simply specify the container flag to \
limit what containers to show. By default all containers are listened to."
LICENSE = "Apache-2.0"

PV = "1.34.0"

RPM_NAME = "stern-1.34.0-1.4.aarch64.rpm"
RPM_HASH = "e2c886a5d3cf6cc375432737925c2ed218e71d1dee30407be3d057f176a995b1b20cf15068dd83033b192b222b600115b72f527da56202135bde1bb7932e1098"

RPROVIDES:${PN} += "stern"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
