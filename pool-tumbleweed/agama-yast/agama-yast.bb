SUMMARY = "YaST integration service for Agama - common files"
DESCRIPTION = "D-Bus service exposing some YaST features that are useful for Agama."
LICENSE = "GPL-2.0-only"

PV = "24"

RPM_NAME = "agama-yast-24-1.1.aarch64.rpm"
RPM_HASH = "6067af9ccbfc8d09cb3be1e81a31371e5bf629bd49a6d02849da125741219cee763fa14dd1690daef01d39a79c57b960ff5c09e792c8d02dfb83768fbda6d5b8"

RPROVIDES:${PN} += "agama-yast"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1-common \
rubygem-agama-yast"

inherit rpm
