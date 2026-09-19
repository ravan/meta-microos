SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install \
the binary to try it out. Works with Syft, the powerful SBOM (software bill of \
materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.118.0"

RPM_NAME = "grype-0.118.0-1.1.aarch64.rpm"
RPM_HASH = "a9971647ec9386ecb47ecb2a1c201cb5b50097564257757654e2bc5d49b1047b385f0fed5ee07c836ce0bd4cf66b724c9d406b3cc8392b662435c606c1b54d2d"

RPROVIDES:${PN} += "grype"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
