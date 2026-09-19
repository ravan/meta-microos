SUMMARY = "Italian ispell dictionary"
DESCRIPTION = "This package includes a ready Italian dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-italian-1.5-426.1.aarch64.rpm"
RPM_HASH = "e11e6bae75263bf0a451e465521927a8d5420fda9d4737c207b7cb17f39ccafa32ec1e4371972979096254fa89b647835cc971460662bb6e4fc25163ad9422b5"

RPROVIDES:${PN} += "iitalian \
ispell-dictionary \
ispell-italian \
locale-ispell-it"

RDEPENDS:${PN} += ""

inherit rpm
