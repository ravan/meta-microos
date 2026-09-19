SUMMARY = "Examples for RunAWK"
DESCRIPTION = "This package contains examples for RunAWK."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "runawk-examples-1.6.1-2.9.noarch.rpm"
RPM_HASH = "0165ee066f8801813af14aa785e7d66c12f25cb9f739dbcc79aa3771ca92cb29533ed422d8c6a8d97cb83a980ce27234051271ce9a47696143c898a51aed4638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "runawk-examples"

RDEPENDS:${PN} += "runawk"

inherit rpm
