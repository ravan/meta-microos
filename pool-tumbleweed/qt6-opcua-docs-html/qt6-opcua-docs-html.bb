SUMMARY = "Documentation for qt6-opcua in HTML format"
DESCRIPTION = "This package contains documentation for qt6-opcua in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-opcua-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e133773bb23efb3e6ee985a3d7cc7c4b0889fac7bc689dfc0cf7d576acd3a19c96e2cfd6493dcc420c6e7452dfa895935148e3a2ec2148c2603684c3b2ffda0a"

RPROVIDES:${PN} += "qt6-opcua-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
