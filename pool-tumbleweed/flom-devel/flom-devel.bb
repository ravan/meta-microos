SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. \
 \
This package contains the files required to build programs with FLoM."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "flom-devel-1.6.1-2.11.aarch64.rpm"
RPM_HASH = "43e7a953a44608c32f9bcf4d8f61b2157e7a4c0005edc26b0057d2eb719cd72cdca9bac14556c42d381275efea7162b5429e32a375ecb28c6d8aa9e7c77892c6"

RPROVIDES:${PN} += "flom-devel"

RDEPENDS:${PN} += "libflom0"

inherit rpm
