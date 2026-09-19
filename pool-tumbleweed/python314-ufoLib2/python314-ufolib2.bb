SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.18.1"

RPM_NAME = "python314-ufoLib2-0.18.1-1.4.noarch.rpm"
RPM_HASH = "6933e870a63517933155a71c3748a5df052add7be5649e9ede1b2bc6fe212b1158818b27fa452aecc49b66affe1815ff4fe4f25a8b8bf1adba831414d208665f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ufolib2 \
python314-ufoLib2 \
python3dist-ufolib2"

RDEPENDS:${PN} += "python-abi \
python314-FontTools \
python314-attrs \
python314-fs"

inherit rpm
