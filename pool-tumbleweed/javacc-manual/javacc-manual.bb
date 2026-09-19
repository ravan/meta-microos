SUMMARY = "Manual for javacc"
DESCRIPTION = "Manual for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.13"

RPM_NAME = "javacc-manual-7.0.13-2.11.noarch.rpm"
RPM_HASH = "bccc4fb9f647b809a23010acfb9e63fa2df6743564d06c6ea1831732be2a242cdd4b41d5187f3669ce87991947311eff809cee4110dbf659ecc84e9ed301b5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-manual"

RDEPENDS:${PN} += ""

inherit rpm
