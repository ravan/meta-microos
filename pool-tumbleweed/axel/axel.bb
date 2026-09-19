SUMMARY = "Lightweight Download Accelerator"
DESCRIPTION = "Axel tries to accelerate HTTP/FTP downloading process by using multiple \
connections for one file. It can use multiple mirrors for a download. Axel has \
no dependencies and is lightweight, so it might be useful as a wget clone on \
byte-critical systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.14"

RPM_NAME = "axel-2.17.14-1.9.aarch64.rpm"
RPM_HASH = "ec170e56ea7b6e331b72938588cea87e30eb6749e16f809bf7842c4f698f13d7f3b22daa5e577389f9e931a28a5254e0d95b55e1b3265757ae2decb6c6294449"

RPROVIDES:${PN} += "axel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
