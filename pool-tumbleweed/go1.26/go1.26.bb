SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.26.8"

RPM_NAME = "go1.26-1.26.8-1.1.aarch64.rpm"
RPM_HASH = "3507b9ff6186e65907c5706d28da3ebe2421b78d233461f046c70508db8772bc518e48ffea28d9b24a4e9a1ab906f1c4d793d0b8a92dd84ddb4fe3437d1bac6b"

RPROVIDES:${PN} += "config-go1.26 \
go \
go-devel \
go-devel-static \
go1.26 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
alts \
gcc"

inherit rpm
