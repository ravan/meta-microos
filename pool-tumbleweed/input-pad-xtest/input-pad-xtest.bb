SUMMARY = "Input Pad with XTEST extension"
DESCRIPTION = "The input-pad-xtest package contains XTEST extension module"
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20210817"

RPM_NAME = "input-pad-xtest-1.0.99.20210817-1.8.aarch64.rpm"
RPM_HASH = "89b0fe003ecfeac81781e918038adc2789c78c026468cf2a80d8a6c9feaa7ab563f8619da061ddacd83c7aaceac3e3c650a56f302dc4b15f5ba8c83b3f0ec027"

RPROVIDES:${PN} += "input-pad-xtest \
libinput-pad-xtest-gdk.so"

RDEPENDS:${PN} += "input-pad \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput-pad-1.0.so.1"

inherit rpm
