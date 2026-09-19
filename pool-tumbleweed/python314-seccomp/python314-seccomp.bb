SUMMARY = "Python bindings for seccomp"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface. \
 \
This subpackage contains the python3 bindings for seccomp."
LICENSE = "LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "python314-seccomp-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "b5d9501f2f189de1286a41fd6ef647493e82337daa9e47a53eaf06d4e8bfcf523d808d3a6f08b3bfe2c6a31896ecc24cb88b3e2716a065a779ccada95a6fdfe7"

RPROVIDES:${PN} += "python3.14dist-seccomp \
python314-seccomp \
python3dist-seccomp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libseccomp.so.2 \
libseccomp2 \
python-abi"

inherit rpm
