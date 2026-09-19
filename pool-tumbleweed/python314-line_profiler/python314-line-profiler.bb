SUMMARY = "Line-by-line profiler"
DESCRIPTION = "line_profiler will profile the time individual lines of code take to execute. \
The profiler is implemented in C via Cython in order to reduce the overhead of \
profiling. \
 \
Also included is the script kernprof.py which can be used to conveniently \
profile Python applications and scripts either with line_profiler or with the \
function-level profiling tools in the Python standard library."
LICENSE = "BSD-3-Clause"

PV = "5.0.2"

RPM_NAME = "python314-line_profiler-5.0.2-1.4.aarch64.rpm"
RPM_HASH = "19558475e4ef20755756b55b4859968dc11d0d0f49d0d9b88c5774822fc5cc7da7a9002bdde5cc5af3ba4483c17775123a1b342ef8b9a07938d4190d9d5f48c3"

RPROVIDES:${PN} += "python3.14dist-line-profiler \
python314-line-profiler \
python3dist-line-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-ipython \
update-alternatives"

inherit rpm
