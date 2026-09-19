SUMMARY = "Imlib 2 - plugin filters"
DESCRIPTION = "This package has the basic set of plugin filters that come with Imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.12.7"

RPM_NAME = "imlib2-filters-1.12.7-1.1.aarch64.rpm"
RPM_HASH = "5cc9757e4e35c3da72e07cee0c98352fd7de823be0b173cc87a936f2c63b305439b8e3ab030e9559eb3461ad2ffe1f95a706e4b6cf209f889e0abcf11643b2e6"

RPROVIDES:${PN} += "imlib2-filters"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2-1 \
libc.so.6 \
libm.so.6"

inherit rpm
