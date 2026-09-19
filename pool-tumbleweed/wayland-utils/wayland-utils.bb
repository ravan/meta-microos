SUMMARY = "Wayland diagnostic utilities"
DESCRIPTION = "A collection of wayland utilities, presently just wayland-info. \
 \
wayland-info displays information about the protocols supported by a \
Wayland compositor, and a subset of Wayland protocols it knows about, \
namely Linux DMABUF, presentation time, tablet and XDG output \
protocols."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "wayland-utils-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "1abb632d698d1c764e607a1c358008e0dfe7539bb182822a972934cd7888a967682d0293e757775bb16ec31b57fade57488827340f882092358794d97fff5975"

RPROVIDES:${PN} += "wayland-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0"

inherit rpm
