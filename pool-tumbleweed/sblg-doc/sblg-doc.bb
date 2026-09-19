SUMMARY = "Static blog utility"
DESCRIPTION = "Examples and documentation for sblg."
LICENSE = "ISC"

PV = "0.6.1"

RPM_NAME = "sblg-doc-0.6.1-1.3.noarch.rpm"
RPM_HASH = "cf98032ef9bf351d63b74180258899d94672caf1c4df4774b06c97070c657f32f35ae52a15ef694751f28bea6e1347ff0d8fc337e51253cec53dcd6c4fe7b4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sblg-doc"

RDEPENDS:${PN} += ""

inherit rpm
