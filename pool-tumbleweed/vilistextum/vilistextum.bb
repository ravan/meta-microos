SUMMARY = "Convert HTML to text with hyperlink references"
DESCRIPTION = "Simple program for viewing HTML in the terminal. \
 \
It displays hyperlinks as footnotes. \
 \
.mailcap: \
text/html; vilistextum -ul --charset %{charset} - - ; copiousoutput;"
LICENSE = "GPL-2.0-only"

PV = "2.6.9"

RPM_NAME = "vilistextum-2.6.9-2.4.aarch64.rpm"
RPM_HASH = "fc9bad450851a840518ad306838d850284425086c67ddc452687632351c243420c30e24156c093cb0deb4799545f740dc82c096a035edbee8721f9535c35e892"

RPROVIDES:${PN} += "vilistextum"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
