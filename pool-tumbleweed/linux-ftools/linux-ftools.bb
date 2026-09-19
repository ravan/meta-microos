SUMMARY = "Linux command line tools for fallocate, fincore, fadvise, etc"
DESCRIPTION = "These are tools designed for working with modern linux system calls including, \
mincore, fadvise, etc. \
 \
We designed these primarily to work in high performance environments to \
determine information about the running kernel, improve system performance, and \
debug performance problems."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "linux-ftools-1.3.1-1.8.aarch64.rpm"
RPM_HASH = "36c40c4988b121b790115f42e605fdf6567ecd58e13de3f648c594770553b9f73885ba43690f2478d2fafe3ad6b7f0eca7c22a3c7ef6ca012cb239f1c4d4cc9a"

RPROVIDES:${PN} += "linux-ftools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
