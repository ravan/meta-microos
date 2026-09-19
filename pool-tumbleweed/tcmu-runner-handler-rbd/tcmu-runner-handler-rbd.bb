SUMMARY = "Ceph RBD handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS Block Device (RBD) handler for \
tcmu-runner, which allows for LIO/tcmu logical units to be backed by \
RBD images."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "tcmu-runner-handler-rbd-1.6.2-4.6.aarch64.rpm"
RPM_HASH = "f6b6fe909e1062583bd5c33cf6db161439b8ef9f84c510a27a3640b090a82479aa254e386fcaf92731a99128159268ced5ed6acaf11bb66b0e219edf301c3438"

RPROVIDES:${PN} += "tcmu-runner-handler-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librbd.so.1 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm
