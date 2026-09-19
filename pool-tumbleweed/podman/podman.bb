SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "6.0.2"

RPM_NAME = "podman-6.0.2-1.1.aarch64.rpm"
RPM_HASH = "6e11f0c130cbbadb16095b42fd47f40fd4fcf1ea330594c2c90e9e14734a31c4826f6a3f9b7be7a1f58f789c284a35ece475dd663457edaa82e2f341aa95d62c"

RPROVIDES:${PN} += "podman \
podman-cni-config"

RDEPENDS:${PN} += "/usr/bin/sh \
catatonit \
conmon \
fuse-overlayfs \
libc.so.6 \
libcontainers-common \
libgpgme.so.45 \
libseccomp.so.2 \
netavark \
passt \
runc \
timezone"

inherit rpm
