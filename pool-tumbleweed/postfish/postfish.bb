SUMMARY = "A digital audio post-processing tool"
DESCRIPTION = "The Postfish is a digital audio post-processing, restoration, filtering \
and mixdown tool. It works as a linear audio filter, much like a rack \
of analog effects. The first stage of the filter pipeline provides a \
bank of configurable per-channel processing filters for up to 32 input \
channels. The second stage provides mixdown of the processed input \
audio into a group of up to eight output channels. The third stage \
applies processing filters to the output group post-mixdown."
LICENSE = "GPL-2.0-or-later"

PV = "svn17492"

RPM_NAME = "postfish-svn17492-19.8.aarch64.rpm"
RPM_HASH = "e07c0a58711ce0fbea7b832b205365f52f13477c9373ffc2bdc522d1ef6a3e3f337b42a4197b790f7969ad47d635834ee9354aafe91ac7d1402176bc686d2240"

RPROVIDES:${PN} += "postfish"

RDEPENDS:${PN} += "/usr/bin/sh \
fftw3 \
gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
