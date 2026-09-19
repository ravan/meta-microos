SUMMARY = "Alternative status bar for i3"
DESCRIPTION = "i3blocks is a flexible status line for the i3 window manager. It handles \
clicks, signals and language-agnostic user scripts. \
 \
The content of each block (e.g. time, battery status, network state, ...) is \
the output of a command provided by the user. Blocks are updated on click, at a \
given interval of time or on a given signal, also specified by the user. \
 \
It follows the i3bar protocol, providing customization such as text \
alignment, urgency and color."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "i3blocks-1.5-2.19.aarch64.rpm"
RPM_HASH = "d8fe3c992c455301e9c3c7631ad56c991578cd2d6a31cd9374a3b192752d251dd66ce3859abd68453da190ca874fc42bd0f9d7c3398c5d723a461a796d40d59e"

RPROVIDES:${PN} += "config-i3blocks \
i3blocks"

RDEPENDS:${PN} += "acpi \
alsa-utils \
i3 \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
xclip"

inherit rpm
