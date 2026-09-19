SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-activities-stats-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0934be8fac5d65c37189d47ad69d31a63256b490ed5f363df4731b6001ea5673eed0c003095499f32e89ef7f0b5a45deb753c8324a19e6b7614df004a78225a2"

RPROVIDES:${PN} += "plasma6-activities-stats"

RDEPENDS:${PN} += ""

inherit rpm
