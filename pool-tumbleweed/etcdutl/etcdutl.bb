SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line administration utility for etcd. \
It's designed to operate directly on etcd data files. \
 \
For operations over a network, please use `etcdctl`."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "etcdutl-3.7.1-1.2.aarch64.rpm"
RPM_HASH = "b3d4ef6a21ae1ee17c6c95bdb7b0f12b5036023537022a25217f8ed425bddde199575a65534e6bc446bd2682008cfd4f30e784e86c868616694433e8a1f167e6"

RPROVIDES:${PN} += "etcdutl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
