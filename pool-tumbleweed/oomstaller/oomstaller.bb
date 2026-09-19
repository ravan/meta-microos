SUMMARY = "A tool for suppressing swap thrashing at build time"
DESCRIPTION = "Oomstaller is a tool for suppressing swap thrashing at build time. It is \
intended for use in build processes of large processes, using parallelism to \
make use of available CPUs. It works by monitoring memory usage of each process \
when performing a build, and suspends processes as necessary to prevent \
swapping from occurring."
LICENSE = "BSL-1.0"

PV = "0.4.0"

RPM_NAME = "oomstaller-0.4.0-1.5.aarch64.rpm"
RPM_HASH = "0d7a09e88b94e1e97b269790d63d4bb7ba5125131798ef434e72d7bb7a6a0298c87a3c4d09145cbf38eb601f74d21798d4c2532e983b67679cea0f475c577347"

RPROVIDES:${PN} += "oomstaller"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
