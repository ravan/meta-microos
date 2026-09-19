SUMMARY = "A library for managing configuration files"
DESCRIPTION = "A library for managing configuration files, written for wayfire."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "libwf-config1-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "82b5350b44a24e58394e9d2fc20e4d44ddc7e02ce85d31a712b5c8ecdd1ec4ed8fa8d33613af1b7dae48634e2e5f878979f092039511d196cf84a90b7e26c387"

RPROVIDES:${PN} += "libwf-config.so.1 \
libwf-config1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
