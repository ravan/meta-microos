SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.25.14"

RPM_NAME = "go1.25-1.25.14-1.1.aarch64.rpm"
RPM_HASH = "134b2a7abd1d644dd9ee268e60b060d4de5a5efa915e76227663fb7d0dde1931b8980603257307b732e31748f3b6a9bb0acae90c66ecad13d436f14e1b8e9859"

RPROVIDES:${PN} += "config-go1.25 \
go \
go-devel \
go-devel-static \
go1.25 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
alts \
gcc"

inherit rpm
