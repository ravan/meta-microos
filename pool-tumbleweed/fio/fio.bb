SUMMARY = "Flexible I/O tester"
DESCRIPTION = "fio is an I/O tool meant to be used both for benchmark and stress/hardware \
verification. It has support for 4 different types of I/O engines (sync, \
mmap, libaio, posixaio), I/O priorities (for newer Linux kernels), rate I/O, \
forked or threaded jobs, and much more. It can work on block devices as \
well as files. fio accepts job descriptions in a simple-to-understand text \
format. Several example job files are included. fio displays all sorts of \
I/O performance information, such as completion and submission latencies \
(avg/mean/deviation), bandwidth stats, cpu and disk utilization, and more."
LICENSE = "GPL-2.0-only"

PV = "3.42"

RPM_NAME = "fio-3.42-1.3.aarch64.rpm"
RPM_HASH = "0c9a45e4ecb91bacdf3b2c494f6da60516b5abf4e4b30b5c78b8588e1113725cf115d910f608eec9195c6caa49b8c33ea11e2b906803ce8739343a40e35eac88"

RPROVIDES:${PN} += "fio"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libiscsi.so.11 \
libm.so.6 \
libnbd.so.0 \
libnuma.so.1 \
librados.so.2 \
librbd.so.1 \
libz.so.1"

inherit rpm
