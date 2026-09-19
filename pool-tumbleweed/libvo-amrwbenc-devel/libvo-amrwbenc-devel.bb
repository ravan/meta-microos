SUMMARY = "Development files for vo-amrwbenc"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use vo-amrwbenc."
LICENSE = "Apache-2.0"

PV = "0.1.3+5"

RPM_NAME = "libvo-amrwbenc-devel-0.1.3+5-1.12.aarch64.rpm"
RPM_HASH = "0b40da446d3c77b78ae5065aad88b3f2461156b4f0fb8a9279cd60eeecdbb97c60cf0c7e7e6fad4c97263bd68d4c90efa29a37fef8b3a26a2aec0099cf443e0b"

RPROVIDES:${PN} += "libvo-amrwbenc-devel \
pkgconfig-vo-amrwbenc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvo-amrwbenc0"

inherit rpm
