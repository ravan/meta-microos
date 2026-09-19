SUMMARY = "Tool for Converting XML Files to Various Formats"
DESCRIPTION = "This is a package for converting XML files to various formats using XSL \
stylesheets.  As a processor it depends on xsltproc and as a formatter \
for print output it makes use of passivetex."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.29"

RPM_NAME = "xmlto-0.0.29-1.4.aarch64.rpm"
RPM_HASH = "4b6fe9fd633244bf1d08f5a212625719c58dfe727ba78ce85875873d06f43917faf91e1fb87de54ed5975b8113a0fc332d9736bb2c03e6162cac5dfb62d57c31"

RPROVIDES:${PN} += "xmlto"

RDEPENDS:${PN} += "/usr/bin/bash \
docbook-4 \
docbook-xsl-stylesheets \
libc.so.6 \
libxslt-tools"

inherit rpm
