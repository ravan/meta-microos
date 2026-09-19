SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python313-hijri-converter-2.2.4-2.5.noarch.rpm"
RPM_HASH = "3930e3d3b31b9f416ed7b3e71bac4b1caead0ae07ff3b6b1399e5119e294d91d5a1f7002f1101e1ba0405f829951a7cd083e2ced550898d12a64e66f9f4f9c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hijri-converter \
python3.13dist-hijri-converter \
python313-hijri-converter \
python3dist-hijri-converter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
