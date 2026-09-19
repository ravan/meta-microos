SUMMARY = "GObject introspection bindings for the GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstValidate-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "c53802c1e6007b9d972f085250fa44ffac91567c443795b153a99453927171adccc85837fbdfbb7b9b93084e4650b7f29a7bcf1a746fb3adccf8f96aa1a5a4f3"

RPROVIDES:${PN} += "typelib-1-0-GstValidate-1-0 \
typelib-GstValidate"

RDEPENDS:${PN} += "libgstvalidate-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
