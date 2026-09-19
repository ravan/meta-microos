SUMMARY = "Package provides recommended R-codetools"
DESCRIPTION = "This packages provides R-codetools, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.2.20"

RPM_NAME = "R-codetools-0.2.20-58.3.aarch64.rpm"
RPM_HASH = "0e7edd9e7615b7545ee1031e85d1962c50d441837283f633c8a8c5269d690f933801de73305eb8835b72c387ef3150fc62978488e3fec4b24831a762e25d8d3b"

RPROVIDES:${PN} += "R-codetools"

RDEPENDS:${PN} += "R-base"

inherit rpm
