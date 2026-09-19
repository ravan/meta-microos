SUMMARY = "On-screen Keyboard for GNOME -- Library"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "libcaribou0-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "4b06200b52dcfe557be78e09b88fa7165b079e40d852b027fe6b73fb28e4668ef927f094eec6876b6647023445d6c4548f56c14675363367bef229ccadf8e2a4"

RPROVIDES:${PN} += "libcaribou.so.0 \
libcaribou0"

RDEPENDS:${PN} += "/sbin/ldconfig \
caribou-common \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxklavier.so.16 \
libxml2.so.16"

inherit rpm
