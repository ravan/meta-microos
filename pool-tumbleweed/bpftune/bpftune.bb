SUMMARY = "BPF/tracing tools for auto-tuning Linux"
DESCRIPTION = "Service consisting of daemon (bpftune) and plugins which support auto-tuning of \
Linux via BPF observability."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note"

PV = "0.4.2"

RPM_NAME = "bpftune-0.4.2-1.8.aarch64.rpm"
RPM_HASH = "ed67cd7785bab1d38e268fb75eebd2c44a18719583dfb9f681071f380a9858cb899b596b73e15e63f15d9d8837d1cb1ffed62fa22a635f132b8fcd58af9c5485"

RPROVIDES:${PN} += "bpftune"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
libbpf.so.1 \
libbpftune.so.0.4.2 \
libc.so.6 \
libm.so.6 \
libnl-3.so.200"

inherit rpm
