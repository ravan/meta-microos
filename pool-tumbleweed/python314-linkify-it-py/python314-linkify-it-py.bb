SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-linkify-it-py-2.2.0-1.1.noarch.rpm"
RPM_HASH = "06bf8d95e3d0699123a38ffffd885c6b3d42fefe652dee9f6d77bf14e6dcc66afa986c591d2e323a0488bf35dc60944b668dc7622a0cec3aaef11164f2b031df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-linkify-it-py \
python314-linkify-it-py \
python3dist-linkify-it-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
