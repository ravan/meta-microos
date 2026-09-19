SUMMARY = "FlightGear Documentation"
DESCRIPTION = "This package contains pdf, text and html documentation for the \
FlightGear flight simulator package."
LICENSE = "GPL-2.0-only"

PV = "2024.1.7"

RPM_NAME = "FlightGear-docs-2024.1.7-1.1.noarch.rpm"
RPM_HASH = "33e15d3056a87258aeb3c2b3ba26cf07c2ae5fff87402a29d53cb0cacbf6f05a446d4309697093c3f23fec765465cbad3095b66830c2efe50de7d10b74c6fc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "FlightGear-docs"

RDEPENDS:${PN} += "FlightGear-data"

inherit rpm
