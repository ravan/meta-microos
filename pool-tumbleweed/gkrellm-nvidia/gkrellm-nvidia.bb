SUMMARY = "A plugin for GKrellM and Nvidia GPUs"
DESCRIPTION = "A simple GKrellM plugin for reading nvidia GPUs data. Clock, Temperature and \
Fan Speed for multiple GPU are supported."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "gkrellm-nvidia-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "6cd1bc8a911e274e6b10aa083472e3368807816871a46c8ccb9b7f1df7860206aab8ca14fd17867d7877d53cc19f2a57eafadc5f54daf9e04896503aef4a1651"

RPROVIDES:${PN} += "gkrellm-nvidia"

RDEPENDS:${PN} += "gkrellm \
libc.so.6"

inherit rpm
