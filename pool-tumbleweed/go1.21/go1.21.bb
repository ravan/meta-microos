SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.21.13"

RPM_NAME = "go1.21-1.21.13-11.2.aarch64.rpm"
RPM_HASH = "2a8c334c0a526e48fbca93284d1e44c8086402e16d1149ea06e61880aae2637662fb473061a61d86409d96aaee2e3973569c2917d04c078729fe8e6a4b023979"

RPROVIDES:${PN} += "config-go1.21 \
go \
go-devel \
go-devel-static \
go1.21 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
alts \
gcc"

inherit rpm
