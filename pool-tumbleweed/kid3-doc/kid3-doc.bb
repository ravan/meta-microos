SUMMARY = "Documentation for kid3"
DESCRIPTION = "This package provides documentation and help files for kid3."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.7"

RPM_NAME = "kid3-doc-3.9.7-2.6.aarch64.rpm"
RPM_HASH = "52ed1f05b20e311695e06a135f4eae7c48893eb865917f3454958793bce2e418e54a57a994396eaf3181dc4af063af3dd13e5753bb1b30ff52101f2ee2fd13a2"

RPROVIDES:${PN} += "kid3-doc"

RDEPENDS:${PN} += "kid3"

inherit rpm
