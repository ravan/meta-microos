SUMMARY = "EXPERIMENTAL: Development package for the Linux Kernel Library"
DESCRIPTION = "Development package for the Linux Kernel Library (LKL). With LKL, the kernel \
code is compiled into an object file that can be directly linked by \
applications. The API offered by LKL is based on the Linux system call \
interface. \
 \
WARNING: LKL is EXPERIMENTAL; using it could cause data corruption!"
LICENSE = "GPL-2.0-only"

PV = "0.6.4+git.4863.9c68545add5d"

RPM_NAME = "lkl-devel-0.6.4+git.4863.9c68545add5d-2.1.aarch64.rpm"
RPM_HASH = "dbb0642d52e6bf2bc1f16d1700384c10608dc2da8e1407be056ac9f31f34dac45f2ba028725eca671bda0b4942819041226531e5189c2d70f87293f9898d2578"

RPROVIDES:${PN} += "lkl-devel"

RDEPENDS:${PN} += "liblkl0"

inherit rpm
