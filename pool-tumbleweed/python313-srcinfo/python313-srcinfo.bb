SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.2"

RPM_NAME = "python313-srcinfo-0.1.2-3.5.noarch.rpm"
RPM_HASH = "fa09819507892e49cc5d9076b4cfe7593448ec9e2019b6f50c1ee8f16043cedfbdd8ad7a29917f6cbd96471424e9157da4c2f4c5154e99f4896de43699f465ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-srcinfo \
python3.13dist-srcinfo \
python313-srcinfo \
python3dist-srcinfo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-parse"

inherit rpm
