SUMMARY = "The Tilde Toolkit's library for reading and writing configuration files"
DESCRIPTION = "The libt3config library provides functions for reading and writing \
simple structured configuration files."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "libt3config0-1.0.0-1.25.aarch64.rpm"
RPM_HASH = "9e146810b14d1cb1463454ce7e33cd40183fafa0fdf09986d171118fad12d4f4f58718304993de5c7de2c95cc0e56a8bb208f53a7e0fa7b62590e8ef11648666"

RPROVIDES:${PN} += "libt3config.so.0 \
libt3config0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
