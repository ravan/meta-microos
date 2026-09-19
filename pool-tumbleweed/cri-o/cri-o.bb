SUMMARY = "OCI-based implementation of Kubernetes Container Runtime Interface"
DESCRIPTION = "CRI-O provides an integration path between OCI conformant runtimes \
and the kubelet. Specifically, it implements the Kubelet Container Runtime \
Interface (CRI) using OCI conformant runtimes. The scope of CRI-O is tied to \
the scope of the CRI."
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-1.24.3-2.17.aarch64.rpm"
RPM_HASH = "dba894606116645a00be75e9d62368a3d4d99915b8a7a6b42256748b938c9f76e2e67c81fbaff5d6b8a6772b7cc471f23eaae68b8f6c63001280e7310fda307c"

RPROVIDES:${PN} += "config-cri-o \
cri-o \
cri-runtime"

RDEPENDS:${PN} += "/usr/bin/sh \
cni \
cni-plugins \
conmon \
conntrack-tools \
iproute2 \
iptables \
libc.so.6 \
libcontainers-common \
libdevmapper.so.1.03 \
libseccomp.so.2 \
patterns-base-apparmor \
runc"

inherit rpm
