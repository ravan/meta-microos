SUMMARY = "Development files of libfpm_helper0"
DESCRIPTION = "Development Files of libfpm_helper0."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "libfpm_helper-devel-4.7.1-2.11.aarch64.rpm"
RPM_HASH = "bdc9e09369912bdf03a2d815c7017eb918447477beed78d4d41c637006bf9ad41d083b4249574e0565f4e63567b0a5be59a2f75916772f07c64a715e40501e1e"

RPROVIDES:${PN} += "libfpm-helper-devel"

RDEPENDS:${PN} += "libfpm-helper0"

inherit rpm
