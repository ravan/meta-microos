SUMMARY = "The Laptop Mode Tools"
DESCRIPTION = "Laptop Mode Tools is a laptop power saving package for Linux systems. \
It allows you to extend the battery life of your laptop, in several \
ways. It is the primary way to enable the Laptop Mode feature of the \
Linux kernel, which lets your hard drive spin down. In addition, it \
allows you to tweak a number of other power-related settings using a \
simple configuration file."
LICENSE = "GPL-2.0-or-later"

PV = "1.74"

RPM_NAME = "laptop-mode-tools-1.74-3.17.noarch.rpm"
RPM_HASH = "d21e01bfcdf17d51114a90ab23e5dff012314b354eebcf2d33124e15b0fcbc7058414f6c8e55ce5391e53dadf6f24a170395bfd867e49c4e115e6cc513e2df7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-laptop-mode-tools \
laptop-mode-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
