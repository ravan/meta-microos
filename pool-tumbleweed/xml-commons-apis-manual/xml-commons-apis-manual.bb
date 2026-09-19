SUMMARY = "Manual for xml-commons-apis"
DESCRIPTION = "Manual for xml-commons-apis."
LICENSE = "Apache-2.0 & W3C & LicenseRef-SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-manual-1.4.01-7.3.noarch.rpm"
RPM_HASH = "9b6c6d33c7ddddc1a3f472a7090f08797b48852aad02c231b673dc644feb2cbfbd4f9268265868850c75b4ba9f9bfc24bf53403513808b759392bdbbedf8e500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-apis-manual"

RDEPENDS:${PN} += ""

inherit rpm
