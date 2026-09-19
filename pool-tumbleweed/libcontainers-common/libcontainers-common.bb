SUMMARY = "Configuration files common to github.com/containers"
DESCRIPTION = "Configuration files and manpages shared by tools that are based on the \
github.com/containers libraries, such as Buildah, CRI-O, Podman and Skopeo."
LICENSE = "Apache-2.0"

PV = "20260521"

RPM_NAME = "libcontainers-common-20260521-1.1.noarch.rpm"
RPM_HASH = "4a1319344caead780bfacc1fe43c156c32397dc7de4b3d2b65c64a0258ae31bba1b50edc71a8fd96f9703556d9d91f4cc3c329b997675f7adcb285d8ba9b4b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcontainers-common \
libcontainers-image \
libcontainers-storage"

RDEPENDS:${PN} += "/usr/bin/sh \
libcontainers-policy \
registries-conf"

inherit rpm
