SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python314-whatthepatch-1.0.7-2.1.noarch.rpm"
RPM_HASH = "fa3b4ddcc664ed5135819b5cd34f3e55b02ef4e78b4119749f32da8d795e6414eca84b120b4bf5ce4898e0a190b406325913db3970a2230d0f50b39e51d70634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-whatthepatch \
python314-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
