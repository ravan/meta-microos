SUMMARY = "Udev rules for Airspy HF+ SDR"
DESCRIPTION = "Udev rules for Airspy HF+ SDR."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-udev-1.6.8-4.7.aarch64.rpm"
RPM_HASH = "619655220910770594d8a9e7b941a4169f97f7d2b1d262a2643f25749bc6d526f810ee8bc5b4ed35e2a412a2e84a3787c1c5c6e888f8aa957d9871660fdc6535"

RPROVIDES:${PN} += "airspyhf-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
