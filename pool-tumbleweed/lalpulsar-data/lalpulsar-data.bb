SUMMARY = "Data files for use with LAL Pulsar"
DESCRIPTION = "This package provides auxiliary data useful for analyses with LAL Pulsar."
LICENSE = "GPL-2.0-or-later"

PV = "7.1.1"

RPM_NAME = "lalpulsar-data-7.1.1-2.1.noarch.rpm"
RPM_HASH = "cf9f4bb805a6dbffb0fdacd0bd9d2d080c671a0533d50c1ffc3b2154879b0ad46ff94274f7d0b4686aaea59b60995dd99388512dc71e846c454eadaf96762fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lalpulsar-data"

RDEPENDS:${PN} += ""

inherit rpm
