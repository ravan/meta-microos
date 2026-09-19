SUMMARY = "IPC library for oneAPI Threading Building Blocks"
DESCRIPTION = "oneTBB (previously known as TBB) is a flexible C++ library that simplifies the \
work of adding parallelism to complex applications. The library lets you easily \
write parallel programs that take full advantage of the multi-core performance. \
oneTBB provides you with functions, interfaces, and classes to parallelize and \
scale the code. \
 \
This subpackage provides the library required in order to enable inter-process \
(IPC) coordination between oneTBB schedulers for the oneTBB python module."
LICENSE = "Apache-2.0"

PV = "2023.0.0"

RPM_NAME = "libirml1-2023.0.0-1.3.aarch64.rpm"
RPM_HASH = "62904a5c0b6809a8776f32fd412e741548ee706ce432ca3eb2dc793beeb9f6fbcbb2714a08f8369cd3730d8597d0afadb3a869fad26d1c64089e7f470ec39927"

RPROVIDES:${PN} += "libirml.so.1 \
libirml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
