SUMMARY = "Russian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Russian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-ru-10.0.6-1.1.noarch.rpm"
RPM_HASH = "de241e50943c8748064c78e76d9ca6c84256b4f4ca4c2711cf2c877e8e0b8fec4e903ef3758be11cc1bed5af879d3ca80f320c2bc5f2e69cf304b74691667fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ru \
locale-kicad-doc-ru"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
