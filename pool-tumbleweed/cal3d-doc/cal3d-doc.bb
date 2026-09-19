SUMMARY = "Documentation files for cal3D"
DESCRIPTION = "This package contains modeling documention and a users guide \
for cal3d."
LICENSE = "LGPL-2.1-or-later"

PV = "0.120"

RPM_NAME = "cal3d-doc-0.120-5.7.aarch64.rpm"
RPM_HASH = "af3063c74915b1ecafe5bd20f179356d8fb156f94d4f27e2cd0efa926b30ce5f67e03ffdcabb753b8480b66030cbccd9d8e1d9e65843f6b1c62fffdb7df9c3b1"

RPROVIDES:${PN} += "cal3d-doc"

RDEPENDS:${PN} += "cal3d"

inherit rpm
