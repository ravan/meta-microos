SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.20220715.0"

RPM_NAME = "python314-pypng-0.20220715.0-1.13.noarch.rpm"
RPM_HASH = "bb1e5f5bca23e241a2d935a5446555438024de9489c0de217492aa06030c5d592a42fc8b7bb2987e226ab86eb5fb8a833291b5de840851c550f7900d7061158a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypng \
python314-pypng \
python3dist-pypng"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
