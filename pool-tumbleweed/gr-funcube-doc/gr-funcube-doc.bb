SUMMARY = "Documentation for gr-funcube"
DESCRIPTION = "Documentation for gr-funcube module for GNU Radio."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-doc-3.10.0.rc3-3.5.noarch.rpm"
RPM_HASH = "ffc90a0457934680b59eab1dfe1c6bbe9f9d7c367077a72252cd5041e884c3e4f51a70a68ddfc9b0519ca99263122d816d4f19b650578949b10018bd922bce7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-funcube-doc"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
