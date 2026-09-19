SUMMARY = "Firmware required to run the Armada80x0McBin"
DESCRIPTION = " \
 \
 \
Firmware required to run the Armada80x0McBin"
LICENSE = "SUSE-Firmware"

PV = "202502"

RPM_NAME = "edk2-Armada80x0McBin-202502-5.3.aarch64.rpm"
RPM_HASH = "aef08de17e519cd772d737058c7b09dd16d3f43e059a2267a9545f27996f3edeb921d4aaeb9dab733949ee83fdb3f124c48599a3c94efb90f426dfaf757b204d"

RPROVIDES:${PN} += "edk2-Armada80x0McBin"

RDEPENDS:${PN} += ""

inherit rpm
