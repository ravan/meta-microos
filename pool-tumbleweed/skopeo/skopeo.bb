SUMMARY = "Container image repository tool"
DESCRIPTION = "skopeo is a command line utility for various operations on container images and \
image repositories. skopeo is able to inspect a repository on a Docker registry \
and fetch images layers. skopeo can copy container images between various \
storage mechanisms."
LICENSE = "Apache-2.0"

PV = "1.24.0"

RPM_NAME = "skopeo-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "ea2176ec52426780ad5ad2c620d3d572619027bde30bc7846621d204ba150840c6aa692e51f1cdfd7ce34c34a487c478a5346592328a0fc0c47ffd2454118d78"

RPROVIDES:${PN} += "skopeo"

RDEPENDS:${PN} += "libc.so.6 \
libcontainers-common \
libgpgme.so.45"

inherit rpm
