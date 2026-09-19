SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-systemd-sleep-plugin-2.14-19.1.noarch.rpm"
RPM_HASH = "769db8d6529f1bddd4efd5dd8f6e246458991181fec7f191471aa86e08430ef3cb4851b5a7e967bf0c684d222ebadd6c0fdce75696af3bd285bd549ceff515e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
util-linux"

inherit rpm
