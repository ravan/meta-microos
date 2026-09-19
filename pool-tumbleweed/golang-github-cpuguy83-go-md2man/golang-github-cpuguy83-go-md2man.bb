SUMMARY = "Convert markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "golang-github-cpuguy83-go-md2man-2.0.0+git20190314.f79a8a8-2.12.aarch64.rpm"
RPM_HASH = "dfee1301694c6c0c8b5a4f3f0caa16efdf16ae594246c2c8d9c1aa167093ed2dc47fc10ae2f84a6d1c752853a7400a7b164511e5be4fb3fbddd275179a32dcee"

RPROVIDES:${PN} += "golang-github-cpuguy83-go-md2man"

RDEPENDS:${PN} += ""

inherit rpm
