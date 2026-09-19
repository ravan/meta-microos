SUMMARY = "Archiving tool for arc achives"
DESCRIPTION = "This package allows you to unpack *.arc file"
LICENSE = "GPL-2.0-only"

PV = "5.21q"

RPM_NAME = "arc-5.21q-7.6.aarch64.rpm"
RPM_HASH = "e1c04981150e804781ec3c2dfb0fa845c0390b4eb95bc2aaf62f47bc75223b7147f9744c34e49b7363bfdb0537ae74d741999f6243265e82723972625b8f98c4"

RPROVIDES:${PN} += "arc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
