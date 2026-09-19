SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.61.0"

RPM_NAME = "python313-memory_profiler-0.61.0-1.4.noarch.rpm"
RPM_HASH = "b37bfee18adebb2fb77aeaaf38799e43753d99f926dc5aa856fcce6851d6726cbd074dc83b20bdcf803001624f7d92b46a2ce7372f2d54d3e310644480d68ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-memory-profiler \
python3.13dist-memory-profiler \
python313-memory-profiler \
python3dist-memory-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-psutil"

inherit rpm
