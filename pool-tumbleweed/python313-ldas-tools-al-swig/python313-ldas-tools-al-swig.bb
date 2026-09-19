SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "python313-ldas-tools-al-swig-2.6.10-1.8.aarch64.rpm"
RPM_HASH = "fede0da05951c8babe8228fd3e478534f05d5b6ca0a51e435ecc87542e22e81e68b0abd2a617773b7f0eef4bea6499715e94f0f56a95bc2dc3805c1da044498d"

RPROVIDES:${PN} += "python3-ldas-tools-al-swig \
python313-ldas-tools-al-swig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
