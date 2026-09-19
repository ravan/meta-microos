SUMMARY = "Documentation for qt6-grpc in HTML format"
DESCRIPTION = "This package contains documentation for qt6-grpc in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-grpc-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6cd0f58d68463fded5a04cba90ef718a15df187fdbce1d4e92aef3e29bf1c649ad44ea6ee2f909bc845e64885d7f8796018d11e2f441e0f713541414830b32f3"

RPROVIDES:${PN} += "qt6-grpc-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
