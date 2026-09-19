SUMMARY = "Frame Streams implementation in C"
DESCRIPTION = "fstrm is a C implementation of Frame Streams that includes a lockless \
circular queue implementation and exposes library interfaces for \
setting up a dedicated Frame Streams I/O thread and asynchronously \
submitting data frames for transport from worker threads. \
 \
Frame Streams is a protocol that allows for the transport of \
arbitrarily encoded data payload sequences with just 4 bytes per data \
frame. Frame Streams does not specify an encoding format for frames \
and can be used with data serialization formats that produces byte \
sequences, such as Protocol Buffers, XML, JSON, MessagePack, YAML, \
etc. Frame Streams can be used both as a streaming transport over a \
reliable byte stream socket (TCP, AF_UNIX, TLS, etc.) for data in \
motion, as well as a file format for data at rest. A 'Content Type' \
header identifies the type of payload being carried over an \
individual Frame Stream and allows cooperating programs to determine \
how to interpret a given sequence of data payloads."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "fstrm-0.6.1-1.16.aarch64.rpm"
RPM_HASH = "9fe83c2c84b4262472a6f5ce1cd179c7c813ecc823f5fa0fb893d9ef67a45f4dfc89d8ca9432b7872b8438a7594b3e26a77cf3adb60ab5ce6c7339ffd976ee8a"

RPROVIDES:${PN} += "fstrm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libfstrm.so.0"

inherit rpm
