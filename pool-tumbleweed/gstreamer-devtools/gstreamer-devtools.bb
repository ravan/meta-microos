SUMMARY = "Development and debugging tools for GStreamer"
DESCRIPTION = "Development and debugging tools for GStreamer \
 \
GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way. \
 \
The easiest way of using GstValidate is to use one of its command-line \
tools, located at tools/ directory. It is also possible to monitor \
GstPipelines from any application by using the LD_PRELOAD gstvalidate \
lib. The third way of using it is to write your own application that \
links and uses libgstvalidate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-devtools-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "9f0c97d917738298f7b2c58b7f0ed195e175aa3e56efa94db746f47f99be2a61da3a0d89313f6200027eaab24e9b66faa8e46c62c7ab8b341dd71f64bab192ea"

RPROVIDES:${PN} += "gstreamer-devtools \
gstreamer-validate"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtspserver-1.0.so.0 \
libgsttranscoder-1.0.so.0 \
libgstvalidate-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
python-abi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk"

inherit rpm
