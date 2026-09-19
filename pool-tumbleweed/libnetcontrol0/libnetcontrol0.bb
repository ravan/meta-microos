SUMMARY = "A network configuration library"
DESCRIPTION = "A interim network configuration library, currently implementing the \
libnetcf interface for libvirt. \
 \
The libnetcontrol0 package provides the shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libnetcontrol0-0.3.2-4.9.aarch64.rpm"
RPM_HASH = "71145df450d554c20e06f254861190ca5f2221c3bb1cebb4ffdebd7e888e8a6c6eea79677a488917f4176692a8369f07a4202624825aa5c8319573a4b682879d"

RPROVIDES:${PN} += "libnetcontrol.so.0 \
libnetcontrol0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
