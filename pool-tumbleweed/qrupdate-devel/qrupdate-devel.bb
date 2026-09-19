SUMMARY = "Development files for qrupdate library"
DESCRIPTION = "This package contains the development files for the qrupdate libraries."
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-devel-1.1.2-3.41.aarch64.rpm"
RPM_HASH = "efeadab9ad4295913417d16ce9cde4621ef8a645acdc26bb56752a0a3bcc60516f022c64640ffba6e463c6686c5cacb4d7bcb936ff6856622328cea03b527dd9"

RPROVIDES:${PN} += "qrupdate-devel"

RDEPENDS:${PN} += "libqrupdate1"

inherit rpm
