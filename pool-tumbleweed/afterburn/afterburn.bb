SUMMARY = "A cloud provider agent"
DESCRIPTION = "Afterburn is a one-shot agent for cloud-like platforms which interacts with provider-specific metadata endpoints."
LICENSE = "Apache-2.0"

PV = "5.10.0.git73.b97f772"

RPM_NAME = "afterburn-5.10.0.git73.b97f772-2.2.aarch64.rpm"
RPM_HASH = "28e65cd9e6ffc97e40a143c6219425c103cf8e31b4a83220a6cecf7e652ac6dc9d966de5a282f5ace28cb35dcd264d26576b5bc3a982e9239d4828879f9b08dd"

RPROVIDES:${PN} += "afterburn"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3"

inherit rpm
