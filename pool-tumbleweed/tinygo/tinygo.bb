SUMMARY = "Go toolchain targeting embedded devices and webassembly"
DESCRIPTION = "TinyGo brings the Go programming language to embedded systems and to the modern \
web by creating a new compiler based on LLVM. \
 \
You can compile and run TinyGo programs on over 85 different microcontroller \
boards such as the BBC micro:bit and the Arduino Uno. \
 \
TinyGo can also produce WebAssembly (WASM) code which is very compact in size. \
You can compile programs for web browsers, as well as for server and edge \
computing environments that support the WebAssembly System Interface (WASI) \
family of interfaces. \
 \
https://tinygo.org"
LICENSE = "Apache-2.0"

PV = "0.41.1"

RPM_NAME = "tinygo-0.41.1-1.5.aarch64.rpm"
RPM_HASH = "c141c60c73649d1bbe873f2f2654eba2611690feb00030c14f7f91e1be9d44c858f45056a5183137f9e1cf6b84eb62b2ae24a95916331ad8872db4baac4e2c93"

RPROVIDES:${PN} += "tinygo"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
clang20 \
go1.25 \
libLLVM.so.20.1 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libstdc++.so.6 \
lld20"

inherit rpm
