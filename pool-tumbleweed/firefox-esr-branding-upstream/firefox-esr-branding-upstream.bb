SUMMARY = "Upstream branding for Firefox ESR"
DESCRIPTION = "This package provides upstream look and feel for Firefox ESR."
LICENSE = "MPL-2.0"

PV = "153.2.0"

RPM_NAME = "firefox-esr-branding-upstream-153.2.0-1.1.aarch64.rpm"
RPM_HASH = "7e88cb1e3f36e77ff77edbb611fc30d8389f9dc949662eba3db01bf2fd76d286e6589dbc7c625aadf4e7ed0d197073a99e5d0ba837cb38d002529359057bf8df"

RPROVIDES:${PN} += "firefox-esr-branding \
firefox-esr-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
