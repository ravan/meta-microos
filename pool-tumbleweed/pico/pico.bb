SUMMARY = "A small, easy to use editor"
DESCRIPTION = "Pico is a simple, display-oriented text editor based on the Pine \
message system composer. As with Pine, commands are displayed at the \
bottom of the screen, and context-sensitive help is provided. \
Characters are inserted into the text as they are typed."
LICENSE = "Apache-2.0"

PV = "5.09"

RPM_NAME = "pico-5.09-31.3.aarch64.rpm"
RPM_HASH = "341cc8ad4f11f2666c3cbf11a389185fbc179c5dff0a4ebff71a7dab683777fbc6dcdcf6c09594913e3e6b577c29db39ad330c8c723b4d99f00692896a66e6c3"

RPROVIDES:${PN} += "pico"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
