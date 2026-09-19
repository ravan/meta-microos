SUMMARY = "SDR (Software Defined Radio) project"
DESCRIPTION = "OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "osmosdr-0.1+git.20151211-2.8.aarch64.rpm"
RPM_HASH = "3906fb27c3e59c9e120b06e22653c88ad4a90e6a5b04ae9f690989cafedae8ccd809f45b47407e1b8874170187d4eaa5b5c015ea6a8f7508797268e9f3b1872e"

RPROVIDES:${PN} += "osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
