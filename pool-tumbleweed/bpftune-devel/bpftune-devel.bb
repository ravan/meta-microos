SUMMARY = "Development files for bpftune"
DESCRIPTION = "The bpftune-devel package contains libraries and header files for \
developing BPF shared object tuners that use bpftune"
LICENSE = "GPL-2.0-only-with-Linux-syscall-note"

PV = "0.4.2"

RPM_NAME = "bpftune-devel-0.4.2-1.8.aarch64.rpm"
RPM_HASH = "e3871f152e4bfd8dc41d32f5fdd68392e7f07871d85555b134bc5717d47dce1b9f1ee19973ad439c401b98d7de91be02271267e0a2a8f05005252efd807a1753"

RPROVIDES:${PN} += "bpftune-devel \
libbpftune.so.0.4.2"

RDEPENDS:${PN} += "bpftune \
libbpf.so.1 \
libbpftune0-4-2 \
libc.so.6 \
libcap.so.2"

inherit rpm
