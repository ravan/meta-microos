SUMMARY = "Documentation for POV-Ray"
DESCRIPTION = "This package contains the Povray documentation."
LICENSE = "AGPL-3.0-or-later & CC-BY-SA-3.0"

PV = "3.7.0.10"

RPM_NAME = "povray-doc-3.7.0.10-4.12.noarch.rpm"
RPM_HASH = "99ddfe63755c2ce9b4c662057118d4fb2e72105df58d136b4835e87272ba64d3c2f9dba842d1ee4de37e618d245be67b6ac571ba3ec6d8886fec6bdb00656ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "povray-doc"

RDEPENDS:${PN} += ""

inherit rpm
