SUMMARY = "Multi-purpose WAVE data processing and reporting utility"
DESCRIPTION = "shntool is a multi-purpose WAVE data processing and reporting \
utility. File formats are abstracted from its core, so it can process \
any file that contains WAVE data, compressed or not - provided there \
exists a format module to handle that particular file type. \
 \
shntool has native support for .wav files. Working with other \
lossless audio formats requires appropriate helper programs."
LICENSE = "GPL-2.0"

PV = "3.0.10"

RPM_NAME = "shntool-3.0.10-4.5.aarch64.rpm"
RPM_HASH = "6873ede145d2fadd4399ef4856225969dbb900d0b9fd00327f46750bedeba595d2d21e254d8993062999e5f3bb04ebf35e62b55d57bcfb4fd747c691f23d80c6"

RPROVIDES:${PN} += "shntool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
