SUMMARY = "Tools to generate base lib packages"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating base lib packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20260505"

RPM_NAME = "build-mkbaselibs-20260505-1.3.noarch.rpm"
RPM_HASH = "b41cd2a7e6a19dee542ea656054a8ef038a64d97ec8f7a4eedb1cf6836e31d48f3c80e4d8596fac34c18b82607b5971efd4bc3488d1567311cd93363857a9ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkbaselibs"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
