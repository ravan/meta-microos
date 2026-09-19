SUMMARY = "Tool for Controlling the Special Features of an U3 USB Flash disk"
DESCRIPTION = "u3-tool is a tool for unlocking and configuring U3 smart USB Flash devices.  It \
supports changing the virtual CD partition size, replacing the CD image, \
enabling, disabling, and resetting device security, and unlocking the secured \
data partition."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+svn60"

RPM_NAME = "u3-tool-1.0+svn60-3.9.aarch64.rpm"
RPM_HASH = "019ae38e676d336f437b1716badb49f04fd37e7ebd2aad6a106292c48164baaa69cb4a2ea45ffe6011673a21cc1d906e234777b668d5769bb9e0fffcaa571ae9"

RPROVIDES:${PN} += "u3-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
