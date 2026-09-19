SUMMARY = "Development files to link against Ruby"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "MIT"

PV = "4.0"

RPM_NAME = "ruby-devel-4.0-1.6.aarch64.rpm"
RPM_HASH = "0515abd1497e8fa03b556f00e715b5f2868d86da0dd71769af3683a41bedbef2c4e4b7a2bb30489e8429ed28fa146472637fbc7348fbcd5da9605cef82d76177"

RPROVIDES:${PN} += "ruby-devel"

RDEPENDS:${PN} += "ruby \
ruby4.0-devel"

inherit rpm
