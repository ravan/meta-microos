SUMMARY = "simple wrapper around curl to easily download files"
DESCRIPTION = "A simple curl wrapper which lets you use curl to download files \
without having to remember any parameters. \
Simply call wcurl with a list of URLs you want to download and \
wcurl will pick sane defaults."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "wcurl-8.22.0-1.1.aarch64.rpm"
RPM_HASH = "7d81d68fd58c00d1856bd8478d1c46b98e0c2a1b31f7cfb516e848596530e7a539af4c14993c40d3009b9368e06170f0b80dd3b519bf4ac3bced2a804ea3cf28"

RPROVIDES:${PN} += "wcurl"

RDEPENDS:${PN} += "/usr/bin/sh \
curl"

inherit rpm
