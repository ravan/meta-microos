SUMMARY = "Python bindings for seccomp"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface. \
 \
This subpackage contains the python3 bindings for seccomp."
LICENSE = "LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "python313-seccomp-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "048e055eccb555f1a0aecac85584b8a6f514fdb546de2463821d2f80efb93b140ebe853a65f2ca3925c3f6144458f9a0e67bb1ce7777f41f6b8575695f511508"

RPROVIDES:${PN} += "python3-seccomp \
python3.13dist-seccomp \
python313-seccomp \
python3dist-seccomp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libseccomp.so.2 \
libseccomp2 \
python-abi"

inherit rpm
