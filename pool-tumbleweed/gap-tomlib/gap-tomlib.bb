SUMMARY = "GAP: Library of Tables of Marks"
DESCRIPTION = "The package contains the GAP Library of Tables of Marks."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.11"

RPM_NAME = "gap-tomlib-1.2.11-1.8.noarch.rpm"
RPM_HASH = "d18d66c5a6194014c8cccb4e722591a0d6ec1d97e8eea80e01ee5e1bd3efd2344b108f9c223af3a73a6b42fc1d18c18c658f37fb715ee14f232489440d602d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-tomlib"

RDEPENDS:${PN} += "gap-atlasrep \
gap-core"

inherit rpm
