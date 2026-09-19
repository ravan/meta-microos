SUMMARY = "Files for developing with hunspell"
DESCRIPTION = "Includes and definitions for developing with hunspell."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-devel-1.7.2-1.14.aarch64.rpm"
RPM_HASH = "8b3cf9d64b71a991a72a1d1dc2d843ec4aacf20275736d250df249a8dce04fcc361eac6e9cf0ad0f45c3a1bfdae91b9363d1aa46f9810a91d2dae7c7ee7e8fd3"

RPROVIDES:${PN} += "hunspell-devel \
pkgconfig-hunspell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhunspell-1-7-0 \
libstdc++-devel"

inherit rpm
