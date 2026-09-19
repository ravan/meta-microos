SUMMARY = "Window Manager with a Taskbar -- Default configuration"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small. \
 \
Configuration files from upstream provider without suse branding"
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "icewm-config-upstream-4.1.0-1.1.noarch.rpm"
RPM_HASH = "dac0e0152a5d9de161c031b3fa0966283b7dcfce2abd651682c7568f3e900cabe4c6558d7a910950b47c3fcdec86e2ae44a82373fd812df8352e1d02a98bd728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icewm-config-upstream \
icewm-config-upstream \
icewm-configuration-files"

RDEPENDS:${PN} += ""

inherit rpm
