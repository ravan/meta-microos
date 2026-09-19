SUMMARY = "Library to handle network protocol transport in X"
DESCRIPTION = "xtrans is a library of code that is shared among various X packages to \
handle network protocol transport in a modular fashion, allowing a \
single place to add new transport types. It is used by the X server, \
libX11, libICE, the X font server, and related components."
LICENSE = "X11"

PV = "1.6.0"

RPM_NAME = "xtrans-1.6.0-2.4.noarch.rpm"
RPM_HASH = "907df48fbfff8e582d400a6ea3928ff01e55a8746b57f20b7ff73dbaa4ce444327f8cacada17210261a06959ffcf0830bd4279836c3224f9e0a20f07d4fe6732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xtrans \
xorg-x11-xtrans-devel \
xtrans"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh"

inherit rpm
