SUMMARY = "Documentation for APFEL, a PDF evolution library"
DESCRIPTION = "This package provides documentation for APFEL in PDF (Portable \
Document Format), a PDF (Probability Distribution Function) evolution \
library."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "apfel-doc-3.1.1-2.15.aarch64.rpm"
RPM_HASH = "985716b233bb6eee800fefeb124295615cc8583a05bde463a5f4cc58f106bd70e9af4935898f58c7919033f8807557ce75eec88928124410b22e02e0e7c569b8"

RPROVIDES:${PN} += "apfel-doc"

RDEPENDS:${PN} += ""

inherit rpm
