SUMMARY = "Print Text Directly to the X Window System Root Window"
DESCRIPTION = "Tails a given file anywhere on your X Window System root window with a \
transparent background. It is customizable with regards to font, color, \
and more."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "root-tail-1.2-236.9.aarch64.rpm"
RPM_HASH = "1aca89d1b547e226b60c16e1b5d313cec3c4706b875b515eb24db1a9c09aeff59fda0d92f4230627eab70f749027b340017fc818ed83742164e3e90af9e534b2"

RPROVIDES:${PN} += "root-tail \
roottail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
