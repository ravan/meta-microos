SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-ftp-20260915-3446.1.aarch64.rpm"
RPM_HASH = "44a15d2240e884d6ce56e3e544973cfc6753782d2e102ab2a63e690227a79dad38db66cabec1f850ec81d3da95b214166238b29c923be5ca6dfe7d7fb2f7b1b2"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
