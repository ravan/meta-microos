SUMMARY = "Optical Character Recognition Program"
DESCRIPTION = "GOCR is an optical character recognition program. It reads images in \
many formats and outputs a text file. It is also able to recognize \
and translate barcodes."
LICENSE = "GPL-2.0-or-later"

PV = "0.52"

RPM_NAME = "gocr-0.52-3.13.aarch64.rpm"
RPM_HASH = "2449daef1e69ed37ae87f9315f7f921c733e7d6896424dc2537d2c62816b197725ffec06950fd9e010a15a18409e3da84d6bfe009be1b56aa97ce132ef0f1fb1"

RPROVIDES:${PN} += "gocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetpbm.so.11"

inherit rpm
