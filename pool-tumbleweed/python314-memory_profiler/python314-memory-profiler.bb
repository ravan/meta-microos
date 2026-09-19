SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.61.0"

RPM_NAME = "python314-memory_profiler-0.61.0-1.4.noarch.rpm"
RPM_HASH = "3e8be8d197321435fed7a9603d4fe28f1d2ccd6b6bd1c5fced7d7d7d214cd135fe6f6577b6d26b8b3f1ba858d1c8320571ddbc3790cdee3241597e6841ebc00b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-memory-profiler \
python314-memory-profiler \
python3dist-memory-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-psutil"

inherit rpm
