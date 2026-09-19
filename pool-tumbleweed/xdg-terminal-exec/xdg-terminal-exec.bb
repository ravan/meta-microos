SUMMARY = "XDG terminal execution utility and default terminal specification"
DESCRIPTION = "Utility for XDG terminal execution and defining a systems default graphical terminal emulator."
LICENSE = "GPL-3.0-or-later"

PV = "20260729+git.065925d"

RPM_NAME = "xdg-terminal-exec-20260729+git.065925d-1.1.aarch64.rpm"
RPM_HASH = "18200961d02eb26141f109dc8c067164d2efea3fe168c06cf7931df105c6e681c8c28c96370f70c3557bc424604f7f33e11c4a479fad788020d3d0b86a03c6a4"

RPROVIDES:${PN} += "xdg-terminal-exec"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
