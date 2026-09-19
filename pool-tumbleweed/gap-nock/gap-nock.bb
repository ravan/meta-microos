SUMMARY = "GAP: Comapct Clifford–Klein form existence obstruction computation"
DESCRIPTION = "The NoCK package is used for computing Tolzanoss obstruction for \
compact Clifford–Klein forms."
LICENSE = "MPL-2.0"

PV = "1.5"

RPM_NAME = "gap-nock-1.5-1.9.aarch64.rpm"
RPM_HASH = "680de037f1ca08399fc524013959a4f4055a08aa18d7bdf4a3750829f7f6eaf936515d4999859ebb8c2abf15e2f8b030da18c8f9e263be007216a46a26d9a9f7"

RPROVIDES:${PN} += "gap-nock"

RDEPENDS:${PN} += "gap-core \
gap-corelg \
gap-sla"

inherit rpm
