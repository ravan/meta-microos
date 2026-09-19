SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.2"

RPM_NAME = "python313-binary-1.0.2-1.3.noarch.rpm"
RPM_HASH = "d02c1dc3339273d5b1fbe170653610c3c05027923944a6a1700673520854c84d0f5036a8e3d45cb46e32188bb67cefd369265395b84057d5d9a965b2e70cdded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-binary \
python3.13dist-binary \
python313-binary \
python3dist-binary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
