SUMMARY = "Utility to Set/Show the Host Name or Domain Name"
DESCRIPTION = "This package provides commands which can be used to display the system's DNS \
name, and to display or set its hostname or NIS domain name."
LICENSE = "GPL-2.0-or-later"

PV = "3.25"

RPM_NAME = "hostname-3.25-1.8.aarch64.rpm"
RPM_HASH = "71a1d0a862b604bee1f6212a6230e33c3232e979f89352bf3c69ab393c8a80540a1d3bbaf253dbe95fc7dae217fb0224553b24ab8b477290ab54079599018597"

RPROVIDES:${PN} += "/usr/bin/hostname \
hostname"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
