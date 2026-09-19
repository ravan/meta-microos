SUMMARY = "SDK for the Jameica framework"
DESCRIPTION = "Source code required to build and develop Jameica plugins."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.12.0"

RPM_NAME = "jameica-devel-2.12.0-1.5.noarch.rpm"
RPM_HASH = "73a958ffe6abee7854b4f12f66360cef8b25c48861eb5bc4c26f04056ca83b4a110addad38054910835723fb69e5cb85d696852048c86c25881a6776755e88cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica-devel"

RDEPENDS:${PN} += "jameica"

inherit rpm
