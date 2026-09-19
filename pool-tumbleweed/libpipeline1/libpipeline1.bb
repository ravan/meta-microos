SUMMARY = "A pipeline manipulation library"
DESCRIPTION = "libpipeline is a C library for setting up and running pipelines of \
processes, without needing to involve shell command-line parsing which \
is often error-prone and insecure. This alleviates programmers of the \
need to laboriously construct pipelines using lower-level primitives \
such as fork(2) and execve(2)."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.8"

RPM_NAME = "libpipeline1-1.5.8-1.8.aarch64.rpm"
RPM_HASH = "f96cb8af6c8a1c90594f9a959f498ff74c7cbd800d5f353918dfb82c6e1328bf98f95c97bf905fd999ca3d1f53d955f0d9e3aa57bb0f0dfd55f6e3a436418996"

RPROVIDES:${PN} += "libpipeline.so.1 \
libpipeline1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
