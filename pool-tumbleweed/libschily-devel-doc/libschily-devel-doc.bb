SUMMARY = "Manual pages for libschily functions"
DESCRIPTION = "libschily contains many portability functions used by the Schily \
tools. \
 \
This subpackage contains manual pages for the APIs exposed by libschily."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libschily-devel-doc-2024.03.21-53.5.noarch.rpm"
RPM_HASH = "d8d67f31a993b6d6284b51e580eaa70dbd96402ac4455aa19d178e6e39927c2c015adaa4c698e78861c02427036de1e09bd4b13018d345ef324fbac5dcf41982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libschily-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
