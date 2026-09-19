SUMMARY = "A Friendly Greeting Program"
DESCRIPTION = "The GNU Hello program produces a familiar, friendly greeting. Yes, this is \
another implementation of the classic program that prints “Hello, world!” when \
you run it. \
 \
In the context of the GNU project, the program demonstrates standard argument \
parsing, multi-language support, the GNU coding standards and maintainer \
practices. \
 \
For openSUSE, this package is a sample package demonstrating some rpm packaging \
methods."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.3"

RPM_NAME = "hello-2.12.3-1.4.aarch64.rpm"
RPM_HASH = "3fc62bfb001d4da6502bb94f617ef1419b547127a0e2fbba54866eba3113dc06bf3827b32b2ea037d01176143041f81eb81d2d027361d93514a9716d37112ac5"

RPROVIDES:${PN} += "hello \
mailreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
