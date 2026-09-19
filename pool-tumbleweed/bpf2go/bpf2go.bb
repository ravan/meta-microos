SUMMARY = "CLI tool to read, modify, load and hook eBPF programs"
DESCRIPTION = "bpf2go is a CLI tool to read, modify and load eBPF programs and attach them to \
various hooks in the Linux kernel. \
 \
https://ebpf-go.dev"
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "bpf2go-0.16.0-1.13.aarch64.rpm"
RPM_HASH = "8a700fa2a3d425746fecb431093c59f492e9bec557d8ce3c082a134f3c28593457c7b1b87f8ab7db6684c72af90cf50923e54d0b12fed51ef879d68206488197"

RPROVIDES:${PN} += "bpf2go"

RDEPENDS:${PN} += ""

inherit rpm
