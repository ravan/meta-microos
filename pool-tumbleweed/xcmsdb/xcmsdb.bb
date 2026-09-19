SUMMARY = "Device Color Characterization utility for X Color Management System"
DESCRIPTION = "xcmsdb is used to load, query, or remove Device Color Characterization \
data stored in properties on the root window of the screen as \
specified in section 7, Device Color Characterization, of the \
X11 Inter-Client Communication Conventions Manual (ICCCM)."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xcmsdb-1.0.7-1.8.aarch64.rpm"
RPM_HASH = "d7c7064017f3451284c6c830f10385fe11af5bdd928e7a2b5eb5fa587272d0c0dbd67ae84ec060b5900ab02a9c4a17b8d8789a7ec71c416af6d8a3f7d3e8a76a"

RPROVIDES:${PN} += "xcmsdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
