SUMMARY = "Javadoc for libbase"
DESCRIPTION = "Javadoc for libbase."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libbase-javadoc-1.1.6-2.9.noarch.rpm"
RPM_HASH = "85ceebdb07187fbaa5faf2a1702162a1806849fd81a247773fb10c7e5184ea5247e90526165ff838fb9b9b61e8d290b004427d92ebe7be735ec29c120824a7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbase-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
