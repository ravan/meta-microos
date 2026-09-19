SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.6.6"

RPM_NAME = "kubernetes-etcd-minus2-3.6.6-72.1.aarch64.rpm"
RPM_HASH = "a21eab38b8180192d77661c67fff2df15306ae91d22c1454af773455f2ff2763249ab4bc8e0da7e3896167af253dcae1880ead5d75429c75f7e5939e7b5b1f98"

RPROVIDES:${PN} += "kubernetes-etcd-minus2"

RDEPENDS:${PN} += "etcd-for-k8s1.35"

inherit rpm
