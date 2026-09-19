SUMMARY = "oneAPI Unified Runtime OpenCL adapter"
DESCRIPTION = "oneAPI Unified Runtime (UR) provides a unified interface to device \
agnostic runtimes such as DPC++. \
 \
This package contains the oneAPI Unified Runtime OpenCL adapter."
LICENSE = "Apache-2.0"

PV = "0.11.10"

RPM_NAME = "libur_adapter_opencl0-0.11.10-2.1.aarch64.rpm"
RPM_HASH = "d0c2eb3645a1245687119a46d218847c283db541f36219539b32315f889ba397c4fe2e87b726cd85ef551e1ec93f47d926fa3aa97b146af683cb8aaa3218e98e"

RPROVIDES:${PN} += "libur-adapter-opencl.so.0 \
libur-adapter-opencl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
