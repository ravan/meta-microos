SUMMARY = "Python Bindings for Manipulating Perf Events"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to manipulate perf events."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "python314-perf-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "21422636398de9d7c4b724e597e1ae9341d13c25094ddaa5977556cd39e80aaff45727369b6d73c0ed3a9480c7fb5e4d1e1c39d1db78bb28c874d91eaf35ada1"

RPROVIDES:${PN} += "python3.14dist-perf \
python314-perf \
python3dist-perf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perf \
python-abi"

inherit rpm
