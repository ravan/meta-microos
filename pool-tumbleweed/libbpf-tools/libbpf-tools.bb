SUMMARY = "Tracing libbpf tools from the BPF Compiler Collection"
DESCRIPTION = "libbpf-driven eBPF tracing tools from the BPF Compiler Collection"
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "libbpf-tools-0.37.0-4.1.aarch64.rpm"
RPM_HASH = "fcd977b4c360fab1ffa8cd8248a976920106e5655ce88161acd40d4c542fec5c6f745aa026b50aa5fa1217f4a072ad501cbe98b8fbea8a8d42b681e1faf12862"

RPROVIDES:${PN} += "libbpf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libz.so.1"

inherit rpm
