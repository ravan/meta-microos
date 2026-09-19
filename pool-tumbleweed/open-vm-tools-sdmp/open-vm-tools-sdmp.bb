SUMMARY = "Service Discovery Plugin"
DESCRIPTION = "Service Discovery Plugin"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "13.1.0"

RPM_NAME = "open-vm-tools-sdmp-13.1.0-2.3.aarch64.rpm"
RPM_HASH = "e71721023bb9b6ce54a3643d2d4d705aa2c13c9450fab8f3908f1e0c14c73d51eef598c80dfae703d8e8c7ba2e9cbb4a7dad2ae5b6adea59579f1a7b99732bf7"

RPROVIDES:${PN} += "libserviceDiscovery.so \
open-vm-tools-sdmp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvmtools.so.0 \
open-vm-tools"

inherit rpm
