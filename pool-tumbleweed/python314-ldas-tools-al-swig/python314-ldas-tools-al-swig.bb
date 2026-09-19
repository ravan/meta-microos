SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "python314-ldas-tools-al-swig-2.6.10-1.8.aarch64.rpm"
RPM_HASH = "e28e1b4ebad7b28b1877f6f7ac6911911d36f19c8904af42785ae6d7828491cb38f55249a44fbb1d26a32f31ae0ae5e88a099bcfdbc0672c5a3aec01878a8720"

RPROVIDES:${PN} += "python314-ldas-tools-al-swig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
