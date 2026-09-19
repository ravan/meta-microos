SUMMARY = "Headers for fastjet-contrib"
DESCRIPTION = "This package provides the headers for writing code using fastjet-contrib."
LICENSE = "GPL-2.0-only"

PV = "1.054"

RPM_NAME = "fastjet-contrib-devel-1.054-1.8.aarch64.rpm"
RPM_HASH = "4593cda9693202a9fba71a4a12c6b0d6150740a922787444f5b2c07d5d3c210d3bb9b1f02a3375a056699dbf0357949267bdaa6158cfe1d62334efb31425c180"

RPROVIDES:${PN} += "fastjet-contrib-devel"

RDEPENDS:${PN} += "libfastjetcontribfragile"

inherit rpm
