SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.6.8"

RPM_NAME = "etcd-for-k8s1.36-3.6.8-1.4.aarch64.rpm"
RPM_HASH = "3537ff20261dbfedadccddce166b3938894a4976be5101598e3d0780b52f3b25ac9e95133c0cd8f916eef845581fe359c247714b8cad378de2e842d56f56ac32"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.36"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
