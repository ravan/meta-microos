SUMMARY = "A make-like build tool using Go"
DESCRIPTION = " \
Mage is a make-like build tool using Go. You write plain-old go functions, and Mage automatically uses them as Makefile-like runnable targets."
LICENSE = "Apache-2.0"

PV = "1.15.0"

RPM_NAME = "mage-1.15.0-2.10.aarch64.rpm"
RPM_HASH = "67026acb63612cbfb011b75f667e7a0a3086a6bdaec7346e33a7a824c0638ee634e301584afb176f26a2cab3a400632f64f39b2ce527ef7db10607e601979e64"

RPROVIDES:${PN} += "mage"

RDEPENDS:${PN} += ""

inherit rpm
