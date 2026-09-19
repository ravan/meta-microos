SUMMARY = "Provides vmlinux.h for BPF CO-RE development"
DESCRIPTION = "This package contains a 'vmlinux.h' header file generated from the \
corresponding kernel's BTF (BPF Type Format) data. \
 \
This file provides all kernel types and definitions in a single header, \
intended for use with BPF CO-RE (Compile Once - Run Everywhere) development. It \
serves as a reference template; actual runtime relocation is handled by libbpf."
LICENSE = "GPL-2.0-only"

PV = "7.1.4"

RPM_NAME = "linux-bpf-devel-7.1.4-1.2.2.4.aarch64.rpm"
RPM_HASH = "4ca06ded1c0007d7a4e60374f85e8f5c134da9ef5f10d6497ea3f7c9ad0f32a2b6c06f51a89d049f5fd73d26be262bfb6e13649e8754fb28ba18679bd38b1bc4"

RPROVIDES:${PN} += "linux-bpf-devel"

RDEPENDS:${PN} += ""

inherit rpm
