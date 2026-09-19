SUMMARY = "Documentation for Icecast"
DESCRIPTION = "Icecast is a MP3 and OGG streaming server able to serve many clients \
with MP3 and OGG audio. \
 \
This package contains the upstream HTML documentation and the sample \
configuration files from upstream."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "icecast-doc-2.4.4-5.8.noarch.rpm"
RPM_HASH = "0642a952390a6d9a61697c3eefd57080f410b523d03b16bd545073b52f3b54bda1962a511cbdd0a5c55f788fe0ea81af8ff0d2572e59068aa648c08cacf5c4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icecast-doc"

RDEPENDS:${PN} += ""

inherit rpm
