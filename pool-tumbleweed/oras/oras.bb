SUMMARY = "OCI registry client - manage content like artifacts, images, packages"
DESCRIPTION = "ORAS is the de facto tool for working with OCI Artifacts. It treats media types \
as a critical piece of the puzzle. Container images are never assumed to be the \
artifact in question. ORAS provides CLI and client libraries to distribute \
artifacts across OCI-compliant registries."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "oras-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "020bf4254cb10cc5a947a5ee3b51209abc61c7653d46cbfdbd5f513e5df3f115ddb542686050f395ad51a52e1e8cf34cc50f598bdb5d46805ec4c7928df49956"

RPROVIDES:${PN} += "oras"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
