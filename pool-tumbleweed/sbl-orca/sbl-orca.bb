SUMMARY = "brld-orca brlapi"
DESCRIPTION = "this python module enables orca to use brld for braille output"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.5.0.20130317.git7a75bc29"

RPM_NAME = "sbl-orca-3.5.0.20130317.git7a75bc29-10.4.aarch64.rpm"
RPM_HASH = "78b83db2cd3f23e56579dfe94f45d8dd9be96fa125afdf004b99c241dca79fdf9cd7532353924b5ea1d402410a0d378677f813cae92aee04e0f648c4fdfbf6f1"

RPROVIDES:${PN} += "sbl-orca"

RDEPENDS:${PN} += "orca \
python-abi"

inherit rpm
