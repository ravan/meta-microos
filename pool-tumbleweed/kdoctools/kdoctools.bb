SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.116.0"

RPM_NAME = "kdoctools-5.116.0-1.12.aarch64.rpm"
RPM_HASH = "8f6def6278d5bf6531883ea0ebee62fcaa2e7ece44796a220701a6d90ae13932e64562264b53e2d399c565be5bcf17a1453aef2f3e9e3fc58fb979930b1b0fb2"

RPROVIDES:${PN} += "kdoctools"

RDEPENDS:${PN} += "docbook-xsl-stylesheets \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libexslt.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
