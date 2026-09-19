SUMMARY = "Binding to libuv cross-platform asynchronous I/O"
DESCRIPTION = "Luv is a binding to libuv, the cross-platform C library that does \
asynchronous I/O in Node.js and runs its main loop. \
 \
Besides asynchronous I/O, libuv also supports multiprocessing and \
multithreading. Multiple event loops can be run in different threads. libuv also \
exposes a lot of other functionality, amounting to a full OS API, and an \
alternative to the standard module Unix."
LICENSE = "MIT"

PV = "0.5.13"

RPM_NAME = "ocaml-luv-0.5.13-2.2.aarch64.rpm"
RPM_HASH = "722d03e2706d63d5814048252aca72c2e70a1b6ace37908ba9a9b112f447bb41b4255678482e4b3cd629a646696328b27a37732b4cbde143d764d6c17932c87c"

RPROVIDES:${PN} += "ocaml-luv"

RDEPENDS:${PN} += "libc.so.6 \
libuv.so.1"

inherit rpm
