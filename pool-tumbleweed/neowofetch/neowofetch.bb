SUMMARY = "CLI system information tool written in BASH"
DESCRIPTION = "Displays information about the system next to an image, the OS logo, or any \
ASCII file of choice. The main purpose of Neofetch is to be used in \
screenshots to show other users what OS/Distro is running, what Theme/Icons \
are being used, etc. \
 \
Customizable through the use of command line flags or the user config file. \
There are over 50 config options to mess around with and there's the `print_info() \
function and friends which let you add your own custom info. \
 \
This is the forked version that is maintained together with hyfetch"
LICENSE = "MIT"

PV = "8.1.0"

RPM_NAME = "neowofetch-8.1.0-6.4.noarch.rpm"
RPM_HASH = "2ba9c1c894cb228b65bf2ff71fcb8d531dc138ce4b54e275e141e6c7bc86639298f4e5319e01f38ed3d48f56528a1675d5df5e4eff89c95780514475d8f78ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neofetch \
neowofetch"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
