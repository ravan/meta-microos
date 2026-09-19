SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.23.12"

RPM_NAME = "go1.23-1.23.12-6.2.aarch64.rpm"
RPM_HASH = "2484177e77c04bb5bdd200b4d645c704a036cacef8539e6420b438dfa757a261c5fcf25f4a432fb1c86b89976d37431061792f420646f90a5c8823de39d04f5e"

RPROVIDES:${PN} += "config-go1.23 \
go \
go-devel \
go-devel-static \
go1.23 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
alts \
gcc"

inherit rpm
