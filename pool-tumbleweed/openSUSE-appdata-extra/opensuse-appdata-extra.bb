SUMMARY = "Additional Appstream Metadata"
DESCRIPTION = "This package contains extra appstream metadata to be used by appstream-builder"
LICENSE = "CC0-1.0"

PV = "1.0.1+git.20240209"

RPM_NAME = "openSUSE-appdata-extra-1.0.1+git.20240209-1.8.noarch.rpm"
RPM_HASH = "04dd0f7a8d1ea9a6709b8474908fbe52b16891887eaf0f185fdcfccc6eb9ee952901a13c1e4cc223ab6f2fe863eed80aff0cc067fb7572e2cd2939aea0445b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-appdata-extra"

RDEPENDS:${PN} += ""

inherit rpm
