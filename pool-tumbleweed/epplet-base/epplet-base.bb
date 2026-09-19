SUMMARY = "Applets for the Enlightenment DR16 Window Manager"
DESCRIPTION = "Epplets are programs designed to work with the Enlightenment Window \
Manager Version 0.16.  Generally they are quite small and \
provide a quick way for a user to perform simple tasks or view \
information."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "epplet-base-0.16-1.10.aarch64.rpm"
RPM_HASH = "52460b50b7b4b952c5382f9b58aa701d198e85f5c408a4ee854f53ee6b702f8d6d447e933da79bcb3157a4df9cf802809a908f17f9ded51c504b4e03a6dc6a61"

RPROVIDES:${PN} += "epplet-base \
libepplet-glx.so.3 \
libepplet.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
