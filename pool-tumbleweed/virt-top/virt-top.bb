SUMMARY = "Utility like top(1) for displaying virtualization stats"
DESCRIPTION = "virt-top is a 'top(1)'-like utility for showing stats of virtualized \
domains.  Many keys and command line options are the same as for \
ordinary 'top'. \
 \
It uses libvirt so it is capable of showing stats across a variety of \
different virtualization systems."
LICENSE = "GPL-2.0+"

PV = "1.1.2"

RPM_NAME = "virt-top-1.1.2-2.1.aarch64.rpm"
RPM_HASH = "86279d644442269256cad070eeee2ca33508a7fbc5f80d9a191f933cf1bb95ebdff1fa958491560ffedc5980a305528068628a5e3d5da0d9921aa1c12b7ff561"

RPROVIDES:${PN} += "ocamlfind-virt-top \
virt-top"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libvirt.so.0 \
libxml2.so.16"

inherit rpm
