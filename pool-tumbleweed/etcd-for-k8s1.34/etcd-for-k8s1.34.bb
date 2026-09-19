SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "etcd-for-k8s1.34-3.6.5-1.7.aarch64.rpm"
RPM_HASH = "2c78b92d76082201e24a8ffcf62b6b82d84782217f797a968fa15e28a242743148371cc7121c291ba578492c9a7ba75023d552bf9d4d25960d98a1df4803d7a4"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.34"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
