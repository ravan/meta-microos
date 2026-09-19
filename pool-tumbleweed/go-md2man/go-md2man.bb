SUMMARY = "Tool to converts markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "go-md2man-2.0.0+git20190314.f79a8a8-2.12.aarch64.rpm"
RPM_HASH = "280a8663396a6ffd7755706e3f7ed5f8b069804ad8af61790cb8f3aadba1940866ec72b7b074efeadbfb848697c04ce79b45c0d6e2ee64d4e1c90f10620cbd9a"

RPROVIDES:${PN} += "go-go-md2man \
go-md2man"

RDEPENDS:${PN} += ""

inherit rpm
