SUMMARY = "Documentation for salt, a parallel remote execution system"
DESCRIPTION = "This contains the documentation of salt, it is an offline version of http://docs.saltstack.com."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-doc-3006.0-70.1.aarch64.rpm"
RPM_HASH = "e1181fff765f1992295dc2d7d2810176d271f2f69f6bc57fc4e7a494a15905bcfa8e2a2892c8a74c39a48dd4c61ed01d5a9e33638a47f9800617031513cfe5d6"

RPROVIDES:${PN} += "salt-doc"

RDEPENDS:${PN} += "salt"

inherit rpm
