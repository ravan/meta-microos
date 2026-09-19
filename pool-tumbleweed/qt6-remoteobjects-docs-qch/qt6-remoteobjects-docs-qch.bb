SUMMARY = "Documentation for qt6-remoteobjects in QCH format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjects-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1231c8202c416f4752a282ab9d64bf0bd101e88d15ad3ab46008d6ca2b309c8014740ac17a54ed39ec4af710b71921e6d1d34b7d4e80b9e7db6d2fb236006956"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
