SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.24.13"

RPM_NAME = "go1.24-1.24.13-5.2.aarch64.rpm"
RPM_HASH = "fd3272cdaa8a395331f2f820e145615963b6ac714dffd68ba0a4b59e6597db87115e143941d528341347c4f37d20c19bc8b259ac6b5f676ba1d65a162d523f6a"

RPROVIDES:${PN} += "config-go1.24 \
go \
go-devel \
go-devel-static \
go1.24 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
alts \
gcc"

inherit rpm
