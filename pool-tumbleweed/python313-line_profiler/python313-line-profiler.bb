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

RPM_NAME = "python313-line_profiler-5.0.2-1.4.aarch64.rpm"
RPM_HASH = "3c2477a7deb14eb0811e18e1e8773a50e48f4fad4f06806aa565f5def2f3114f1e9b558f7dfe29d4d30edb53aef8eb37965f1067bcd8659613b86f8704976a69"

RPROVIDES:${PN} += "python3-line-profiler \
python3.13dist-line-profiler \
python313-line-profiler \
python3dist-line-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-ipython \
update-alternatives"

inherit rpm
