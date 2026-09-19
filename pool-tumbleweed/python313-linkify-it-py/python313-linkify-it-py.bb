SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-linkify-it-py-2.2.0-1.1.noarch.rpm"
RPM_HASH = "697beded9c33aaf8097deb1f8b93e17605205a004be991792d2496854691820238e273d50f3ede87ca632f231ed1944a8c950b65f730784c334fc9b120fb59ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linkify-it-py \
python3.13dist-linkify-it-py \
python313-linkify-it-py \
python3dist-linkify-it-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
