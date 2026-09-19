SUMMARY = "K8s yaml file to deploy busybox"
DESCRIPTION = "K8s yaml file to deploy busybox on a kubernetes cluster."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "busybox-k8s-yaml-1.0-2.16.noarch.rpm"
RPM_HASH = "dca13264ca46dc8edb5817a74d172b10b8300ff209f5e82df36c48fda0ae17f438bbbcd1202c5fd800e6e22642ef5b54e7df2a891ba9ba86c65f1edfc403e0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
