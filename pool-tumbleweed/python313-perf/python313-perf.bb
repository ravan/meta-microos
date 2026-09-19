SUMMARY = "Python Bindings for Manipulating Perf Events"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to manipulate perf events."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "python313-perf-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "063ac444868f4d2b4b5f7d63831ba8b0d7689ebb60506f4f8940cedadbd2ea55985f7679c8fbb7b531c1b14d34a7351c5e73b996248ab330894136aaa814d7fa"

RPROVIDES:${PN} += "python3-perf \
python3.13dist-perf \
python313-perf \
python3dist-perf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perf \
python-abi"

inherit rpm
