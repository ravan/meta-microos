SUMMARY = "GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstvalidate-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "b41b61071601ee9e3f0be51c69636c593b53f2768632d803573f58bb04fcf2ef45b650955e4a6bfe355722e1165a6d19b93d89ed9275378b3f03d1ba8ab509cb"

RPROVIDES:${PN} += "libgstvalidate-1-0-0 \
libgstvalidate-1.0.so.0 \
libgstvalidate-default-overrides-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstcheck-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6"

inherit rpm
