SUMMARY = "Simple command-line utility for extracting text from EPUB documents"
DESCRIPTION = "Simple command-line utility for extracting text from EPUB documents"
LICENSE = "GPL-3.0-only"

PV = "2.06"

RPM_NAME = "epub2txt2-2.06-1.13.aarch64.rpm"
RPM_HASH = "ff93b5b49c5d64569eaccb27e34bffe4f1547d2f7d1acbc323c2d005326d26d502707d92ecfe914a96527b9703f8447e69134e2ebc94e1173dc37010caa07d1d"

RPROVIDES:${PN} += "epub2txt2"

RDEPENDS:${PN} += "libc.so.6 \
unzip"

inherit rpm
