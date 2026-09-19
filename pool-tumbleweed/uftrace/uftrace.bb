SUMMARY = "A function call graph tracer for C, C++, Rust and Python programs"
DESCRIPTION = "uftrace is a function call graph tracer for C, C++, Rust and Python programs. \
It hooks into the entry and exit of each function, recording timestamps as well as the function's arguments and return values. uftrace is capable of tracing both user and kernel functions, as well as library functions and system events providing an integrated execution flow in a single timeline. \
Initially, uftrace only supported function tracing with compiler support. However, it now allows users to trace function calls without recompilation by analyzing instructions in each function prologue and dynamically and selectively patching those instructions. \
Users can also write and run scripts for each function entry and exit using python/luajit APIs to create custom tools for their specific purposes. \
uftrace offers various filters to reduce the amount of trace data and provides visualization using Chrome trace viewer and flame graph or call-graph diagrams for graphviz and mermaid, allowing for a big picture view of the execution flow. \
It was heavily inspired by the ftrace framework of the Linux kernel and the name uftrace stems from the combination of user and ftrace."
LICENSE = "GPL-2.0-only"

PV = "0.20"

RPM_NAME = "uftrace-0.20-1.1.aarch64.rpm"
RPM_HASH = "a8c39e7fcfc164c3f8d40c16baa77afada5d1bc90ea3451ea1e49bb2fa9ab7677f393bc417f2dd078683a944f5374fe21e703a20965fd1131a77909ccb4f414d"

RPROVIDES:${PN} += "libmcount-fast-single.so \
libmcount-fast.so \
libmcount-nop.so \
libmcount-single.so \
libmcount.so \
uftrace"

RDEPENDS:${PN} += "libc.so.6 \
libcapstone.so.5 \
libdw.so.1 \
libelf.so.1 \
liblzma.so.5 \
libm.so.6 \
libncursesw.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libtraceevent.so.1"

inherit rpm
