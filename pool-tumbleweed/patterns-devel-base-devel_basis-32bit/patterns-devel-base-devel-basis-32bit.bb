SUMMARY = "Base Development"
DESCRIPTION = "The 32bit pattern complementing devel_basis."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_basis-32bit-20170319-13.4.aarch64.rpm"
RPM_HASH = "c174d340a4826491d3e66c0c788f0ed5f09c267f269ef6ca7220a7a7e1b06a4ec788feb0671fe1a10dade92d549ae1df833cc1f9beb10bc78ef428919ec06ce5"

RPROVIDES:${PN} += "pattern- \
patterns-devel-base-devel-basis-32bit"

RDEPENDS:${PN} += ""

inherit rpm
