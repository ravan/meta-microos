SUMMARY = "Runtime and development documentation for gsoap"
DESCRIPTION = "This subpackage contains the documentation for the gSOAP toolkit."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.144"

RPM_NAME = "gsoap-doc-2.8.144-1.1.noarch.rpm"
RPM_HASH = "085a9b5ebe034ceb42413a48d67ae4483c62c1f455aae85487f028df9b87bab9bdbe8304360c575d7387f104d62ec74923c425cdf7e15b83c01278957482b4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsoap-doc"

RDEPENDS:${PN} += ""

inherit rpm
