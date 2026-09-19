SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "libiw-devel-30.pre9-41.9.aarch64.rpm"
RPM_HASH = "95c80a146087e272d3f723966a261a185413f3c449036e6e39bf0aac23c999803628660996016e254e390bf6b4feb3464e3dbdd12e494126399194903a777817"

RPROVIDES:${PN} += "libiw-devel"

RDEPENDS:${PN} += "glibc-devel \
libiw30"

inherit rpm
