SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.27"

RPM_NAME = "go-1.27-1.1.aarch64.rpm"
RPM_HASH = "0101069815ca8af2c842dd9983da5a2c4ac590942d6d5dd301283e12a97ddda44661f59cd4cbd8648261b089ac885b8481d613a7c29e084e660b1f27b7ad0c1d"

RPROVIDES:${PN} += "go \
golang \
golang-API"

RDEPENDS:${PN} += "go1.27"

inherit rpm
