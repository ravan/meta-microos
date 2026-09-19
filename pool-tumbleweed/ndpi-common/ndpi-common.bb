SUMMARY = "Common files used by nDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains common files used by nDPI."
LICENSE = "LGPL-3.0-only"

PV = "4.12"

RPM_NAME = "ndpi-common-4.12-1.8.aarch64.rpm"
RPM_HASH = "d7dbef8291444f31efa114d1ac666fe825d1db7f1529d2abacf439de354e95e48cf02adcef6707dfc2603040b8dfad296157182cd4155b5e1813bce32de47668"

RPROVIDES:${PN} += "ndpi-common"

RDEPENDS:${PN} += ""

inherit rpm
