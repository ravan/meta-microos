SUMMARY = "Language data for numbertext"
DESCRIPTION = "This package contains data providing information for localized nubertext \
conversions."
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-data-1.0.11-1.14.aarch64.rpm"
RPM_HASH = "cb1ad26c27ad40d9b9b851f3570622c937a14f9f7b2e6be164cf106bfc1184e17818c0f0258b9e3e8fce23fbc98b88fc3dcbf560ccb871bd7f38515c4c5d6d55"

RPROVIDES:${PN} += "libnumbertext-data"

RDEPENDS:${PN} += ""

inherit rpm
