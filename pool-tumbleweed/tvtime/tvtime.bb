SUMMARY = "High Quality Television Application"
DESCRIPTION = "tvtime is a high quality television application for use with video \
capture cards.	tvtime processes the input from a capture card and \
displays it on a computer monitor or projector.  Unlike other \
television applications, tvtime focuses on high visual quality."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.11"

RPM_NAME = "tvtime-1.0.11-4.6.aarch64.rpm"
RPM_HASH = "f39e7a3e6f7174189be1b89d0ff34867d5ee863172ef77c436f2e0ae4af4e45bdac179837a3e6b17039ce47c38c099f187e784d219049873e3c07c44e81388a0"

RPROVIDES:${PN} += "config-tvtime \
tvtime"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXv.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libpng16.so.16 \
libxml2.so.16"

inherit rpm
