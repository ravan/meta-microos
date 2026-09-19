SUMMARY = "Development files for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.7.0"

RPM_NAME = "libbpf-devel-1.7.0-2.1.aarch64.rpm"
RPM_HASH = "f29b7ef71c149fdddd9fbe2ad4d63d3a7993aa5965d38f22959f2bcf13127bbfc4af19d3e2f7d4840b6693d86160dc56a7679998284cbc068754fcd7affafb60"

RPROVIDES:${PN} += "libbpf-devel \
pkgconfig-libbpf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbpf1 \
pkgconfig-libelf \
pkgconfig-zlib"

inherit rpm
