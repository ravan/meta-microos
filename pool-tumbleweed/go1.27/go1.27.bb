SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.27.1"

RPM_NAME = "go1.27-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "de27013a9cec993bd9dfd8777c4d8499ddc5bc645e0776c114c51574a56e36652702ccb51bbfcacdac95879d85ba6b0667a98e520319307a9cbeb042c4256370"

RPROVIDES:${PN} += "config-go1.27 \
go \
go-devel \
go-devel-static \
go1.27 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
alts \
gcc"

inherit rpm
