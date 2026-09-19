SUMMARY = "Static library for capstone"
DESCRIPTION = "Statically linked libcapstone."
LICENSE = "BSD-3-Clause"

PV = "5.0.6"

RPM_NAME = "libcapstone-devel-static-5.0.6-2.3.aarch64.rpm"
RPM_HASH = "be254662a8080e6f1c205ce21cb242cb8015d97edfc8dacd9857c0b71d6d1c639bb36c9545052025e9e886061bf200b5391fb1f453b37bd820858de551196faf"

RPROVIDES:${PN} += "libcapstone-devel-static"

RDEPENDS:${PN} += "libcapstone-devel"

inherit rpm
