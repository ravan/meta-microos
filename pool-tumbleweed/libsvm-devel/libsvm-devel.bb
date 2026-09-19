SUMMARY = "C headers for developing programs with libsvm"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications with libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.36"

RPM_NAME = "libsvm-devel-3.36-1.6.aarch64.rpm"
RPM_HASH = "9d3a1a8f9d6385211448550370cdf6d69916700d2d742f6475ab3f7bab27d293906aa1ac80a659614fa0fe5c86ac19edd1d9ef76f188d6226d300379cc6eb06f"

RPROVIDES:${PN} += "libsvm-devel"

RDEPENDS:${PN} += "libsvm4"

inherit rpm
