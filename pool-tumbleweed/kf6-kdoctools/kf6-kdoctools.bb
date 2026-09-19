SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kdoctools-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6c2b930f8980bf583705e2c17a2b197fbae5384d355512dd6346ecf4f17830a435bff12c0e0f902c0eeb67125fd130ae470b7b7c5b6769dfc24032e12b885587"

RPROVIDES:${PN} += "kf6-kdoctools \
kf6-kdoctools-doc"

RDEPENDS:${PN} += "docbook-xsl-stylesheets \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libexslt.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
