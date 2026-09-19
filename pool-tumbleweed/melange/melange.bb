SUMMARY = "Build APKs from source code"
DESCRIPTION = "Build apk packages using declarative pipelines. \
 \
Commonly used to provide custom packages for container images built with apko. \
The majority of apks are built for use with either the Wolfi or Alpine Linux \
ecosystems. \
 \
Key features: \
 \
* Pipeline-oriented builds. Every step of the build pipeline is defined and \
  controlled by you, unlike traditional package managers which have distinct \
  phases. \
* Multi-architecture by default. QEMU is used to emulate various architectures, \
  avoiding the need for cross-compilation steps."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "melange-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "d7462e3d2b755e6445eb6693cab99c7104f34f050d1aff36b3360b1bb6795ba76e96fe07198470ec90fe1e37beba54fff1b9c845a0122344c3c54ca9af0034d6"

RPROVIDES:${PN} += "melange"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
