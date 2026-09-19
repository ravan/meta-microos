SUMMARY = "GNUnet library libgnunettransportcommunicator"
DESCRIPTION = "This package contains the libgnunettransportcommunicator library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettransportcommunicator0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "4876f29299acff93f6458a85d3afc63588d6999a393fae3478b60026c9fc832403b6cf7fd63286d3f156035b08b0158d21c7cb7b877e2e948c9c1db1af9c1109"

RPROVIDES:${PN} += "libgnunettransportcommunicator.so.0 \
libgnunettransportcommunicator0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
