SUMMARY = "Linux/POSIX emulation of Win32::SerialPort functions"
DESCRIPTION = "This module provides an object-based user interface essentially identical \
to the one provided by the Win32::SerialPort module."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Device-SerialPort-1.04-26.56.aarch64.rpm"
RPM_HASH = "4cf270573d6425a66ed024f422085f82a4be847df00d43c1a54b3fe109b8f7b8310696539068a2abf69836943c8da671db0650f9c519231d0f6b24c8dedf6b94"

RPROVIDES:${PN} += "Device-SerialPort \
perl-Device--SerialPort \
perl-Device-SerialPort"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
