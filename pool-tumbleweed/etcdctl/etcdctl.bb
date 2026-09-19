SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line client for etcd. It can be used in scripts or for administrators \
to explore an etcd cluster."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "etcdctl-3.7.1-1.2.aarch64.rpm"
RPM_HASH = "7a165837c0f5bd165a6c1f7188862d75995b6f9c0a457f8170fa02cc3de12777c0e717c39a3ccd2b3f612bbd0c9d4159c650b4dc09a21e135e4c66b4fb1c340f"

RPROVIDES:${PN} += "etcdctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
