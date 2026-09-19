SUMMARY = "Lightweight library to simplify and generalize unit tests for C"
DESCRIPTION = "cmocka is an elegant unit testing framework for C with support for mock \
objects. It only requires the standard C library, works on a range of computing \
platforms (including embedded) and with different compilers. \
 \
Features: \
  * Support for mock objects \
  * Only requires the C library \
  * Several supported output formats (Subunit, TAP, jUnit XML) \
  * Fully documented API \
  * Test fixtures \
  * Exception handling for signals (SIGSEGV, SIGILL, ...) \
  * No fork() used \
  * Very well tested \
  * Testing of memory leaks, buffer overflows and underflows. \
 \
Also, CMocka tries to avoid the use of some of the newer features of C \
compilers."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "libcmocka0-2.0.2-1.4.aarch64.rpm"
RPM_HASH = "b7b301e93c4ea367a5660660a09776d33238d836f83b2de3464ca6588af6253da2c8777d798dd18909dd169c8d68b7a2051df4002dba8d4bf4bb1af7af44720c"

RPROVIDES:${PN} += "libcmocka.so.0 \
libcmocka0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
