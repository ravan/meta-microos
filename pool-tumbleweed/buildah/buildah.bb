SUMMARY = "Tool for building OCI containers"
DESCRIPTION = "Buildah provides a command line tool which can be used to: \
- Create a working container, either from scratch or using an image as a \
  starting point \
- Create an image, either from a working container or via the instructions in a \
  Dockerfile \
- Build images in either the OCI image format or the traditional \
  upstream docker image format \
- Mount a working container's root filesystem for manipulation \
- Unmount a working container's root filesystem \
- Update the contents of a container's root filesystem \
- Delete a working container or an image"
LICENSE = "Apache-2.0"

PV = "1.45.0"

RPM_NAME = "buildah-1.45.0-1.1.aarch64.rpm"
RPM_HASH = "db01b261c6b99b44796a6a446cad621a453b52a5cb09d95beaae31acb6e3eda4a06cbe36c30c88787fef9893d8fca7951c387f574212f20a0f9de070f3aecca1"

RPROVIDES:${PN} += "buildah"

RDEPENDS:${PN} += "libc.so.6 \
libcontainers-common \
libgpgme.so.45 \
libseccomp.so.2 \
netavark \
passt \
runc \
slirp4netns"

inherit rpm
