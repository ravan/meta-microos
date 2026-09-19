SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "etcd-for-k8s1.37-3.7.0-1.1.aarch64.rpm"
RPM_HASH = "e78e86e277aecddc78bd7b91eb34e84f33a45f77192e91e7ce1cf4206922c8979b83ce321e3497a9874fc17bad172ed55aa15abfe32fe6240f42b244ad29994b"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.37"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
