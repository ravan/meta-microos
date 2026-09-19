SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.22.12"

RPM_NAME = "go1.22-1.22.12-7.2.aarch64.rpm"
RPM_HASH = "8416f02ce8516f7951a5dc139ce9f7a83b7081ae296d63f380a4cb0dd9f4a2e0dbf13ba7989115f48fbc18f691eabbdae265b8df3152a662d6498e39269e649f"

RPROVIDES:${PN} += "config-go1.22 \
go \
go-devel \
go-devel-static \
go1.22 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
alts \
gcc"

inherit rpm
