SUMMARY = "Development files for Rocs"
DESCRIPTION = "This package provides development files and headers needed \
to build software using Rocs."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "rocs-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "42562b54341334776a64d26443d6694e20ab565f42fd6b41d136c8fb51e8d25b91db96c596bfe9a1892fcb6ac9b7bcf25adcb636e96535b2e35ded292703cab4"

RPROVIDES:${PN} += "rocs-devel"

RDEPENDS:${PN} += "librocsgraphtheory0"

inherit rpm
