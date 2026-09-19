SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kopeninghours-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a59fbb58e5aa32b26505a4695fb90b9f9ca547a5fea1c44ea53be9d6e1881793da5bd2e20a2753ed3c425df27b591052cf284152ae934d9f69c3992080e4f1b9"

RPROVIDES:${PN} += "kopeninghours"

RDEPENDS:${PN} += ""

inherit rpm
