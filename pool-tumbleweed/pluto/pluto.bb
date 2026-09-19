SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in \
their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.24.3"

RPM_NAME = "pluto-5.24.3-1.1.aarch64.rpm"
RPM_HASH = "b3038c1ff3bd4ffc47bdd1e912aa8fc62924e322d24102f8d53a8669d178302283b5fc75d52ff331e06fa6a4fa4d7dda1fdf4231fb1dd92b16699603227e583c"

RPROVIDES:${PN} += "pluto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
