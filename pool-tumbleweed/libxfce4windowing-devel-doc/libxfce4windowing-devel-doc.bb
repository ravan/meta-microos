SUMMARY = "Documentation for libxfce4windowing"
DESCRIPTION = "Provides documentation for libxfce4windowing, \
an abstraction library that attempts to present windowing \
concepts (screens, toplevel windows, workspaces, etc.) in a \
windowing-system-independent manner."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.7"

RPM_NAME = "libxfce4windowing-devel-doc-4.20.7-1.1.noarch.rpm"
RPM_HASH = "cd642de8674b3d772bdb4dbb6c8c24beb850ebd8b44393bbeffbd8291cd21668960b7e9389c0f0a5dfcac8fdf1e2e3a1207a88adb22a0e981626e1a9c94f7f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4windowing-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
