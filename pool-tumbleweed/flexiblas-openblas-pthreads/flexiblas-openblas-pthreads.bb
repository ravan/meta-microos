SUMMARY = "FlexiBLAS OpenBLAS pthreads backend"
DESCRIPTION = "This package provides the OpenBLAS pthreads backend for FlexiBLAS."
LICENSE = "LGPL-3.0 & BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "flexiblas-openblas-pthreads-3.5.0-1.2.aarch64.rpm"
RPM_HASH = "b62cb8b32e832ecb529ea2e883de16d16656da04f798ae6641aa4b6ceaff8da7d887b5f8b7f95c648c5ec3c8a07514b0ee222cd44424bdd6b83aee6aa1061e4a"

RPROVIDES:${PN} += "config-flexiblas-openblas-pthreads \
flexiblas-openblas-pthreads \
libflexiblas-openblaspthread.so"

RDEPENDS:${PN} += "flexiblas \
libopenblas-pthreads0 \
libopenblas.so.0"

inherit rpm
