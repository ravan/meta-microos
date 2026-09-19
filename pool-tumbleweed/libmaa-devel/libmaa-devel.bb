SUMMARY = "Development files for libmaa"
DESCRIPTION = "This RPM contains the development files for libmaa."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "libmaa-devel-1.5.1-2.1.aarch64.rpm"
RPM_HASH = "db6894c9f3733035f8fbe9f919299e040127391950bb9f0fe638b104f0e3458c1a7428253c96d6dd9608e935dba6b05ccf58b90cc31c0f2c5f23590d4c60a8f6"

RPROVIDES:${PN} += "libmaa-devel"

RDEPENDS:${PN} += "libmaa4"

inherit rpm
