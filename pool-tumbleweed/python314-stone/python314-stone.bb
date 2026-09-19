SUMMARY = "Stone is an interface description language (IDL) for APIs"
DESCRIPTION = "Stone is an interface description language (IDL) for APIs."
LICENSE = "MIT"

PV = "3.3.9"

RPM_NAME = "python314-stone-3.3.9-3.3.noarch.rpm"
RPM_HASH = "11701e71465ec2c3a724db9ff798102943643eb17d54f4d165af06b9e57ac7c8dbacc6039fc365e9728899578d82b45beae82919a2c93af90441d2cc35ff39cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stone \
python314-stone \
python3dist-stone"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-packaging \
python314-ply"

inherit rpm
