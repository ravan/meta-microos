SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.6.6"

RPM_NAME = "etcd-for-k8s1.35-3.6.6-1.7.aarch64.rpm"
RPM_HASH = "9e2d80ea029ff2321d2e27fb213910147cc2a79570bdae3a7382f3c94937e89173b56424d5769e17814544eb0afcfc46e9d26e277ab7280942ae709d07925071"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.35"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
