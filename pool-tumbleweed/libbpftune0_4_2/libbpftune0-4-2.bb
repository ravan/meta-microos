SUMMARY = "BPF/tracing library"
DESCRIPTION = "Shared library for (bpftune) for auto-tuning of Linux via BPF observability."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note"

PV = "0.4.2"

RPM_NAME = "libbpftune0_4_2-0.4.2-1.8.aarch64.rpm"
RPM_HASH = "406ebf510b169305839f03f19733c3453cdf370b1155f0d69f8cdb62ddefcff3f203f31e90f774f7e1d0fc1a4b0f0e1a2f82f31e9e7192e24cb47e8fe015a591"

RPROVIDES:${PN} += "libbpftune.so.0.4.2 \
libbpftune0-4-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbpf.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
