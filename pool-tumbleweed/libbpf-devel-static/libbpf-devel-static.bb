SUMMARY = "Static library for libbpf"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.7.0"

RPM_NAME = "libbpf-devel-static-1.7.0-2.1.aarch64.rpm"
RPM_HASH = "a8c3803d084c3d6e804d9f7ef3ff5b8e3c30fed86c666d74a481179eba53e3154e063df57141cbb57864390fefaf9b4e7ae268aaedf2ec75db837ee2f58fb824"

RPROVIDES:${PN} += "libbpf-devel-static"

RDEPENDS:${PN} += "libbpf-devel \
libbpf1"

inherit rpm
