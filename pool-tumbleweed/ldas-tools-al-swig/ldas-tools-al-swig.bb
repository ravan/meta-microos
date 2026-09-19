SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "ldas-tools-al-swig-2.6.10-1.8.aarch64.rpm"
RPM_HASH = "7287b24149114560fa77d4a6632db3b112ef8139656a045c32afc00310135f4d254287af6d04112d79a5e6b7905a1b3ad4b6b1d4a00d1b81e0e23ff6974739b3"

RPROVIDES:${PN} += "ldas-tools-al-swig \
python2-ldas-tools-al-swig"

RDEPENDS:${PN} += ""

inherit rpm
