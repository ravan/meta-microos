SUMMARY = "Tools to build a local initramfs"
DESCRIPTION = "This package contains tools to assemble the local initrd and host configuration."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "112+suse.51.gf078a84"

RPM_NAME = "dracut-tools-112+suse.51.gf078a84-1.1.aarch64.rpm"
RPM_HASH = "93c3a1118814bf9f73c7f92904ad0d5b7a230204298a07fd8059daa9dfa28ba38569299cb2b9011057487ab9152b2c88710d5539f20a8fd2701094eb6269dce0"

RPROVIDES:${PN} += "dracut-/usr/bin/dracut-catimages \
dracut-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
