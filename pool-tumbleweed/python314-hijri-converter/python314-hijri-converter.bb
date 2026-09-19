SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python314-hijri-converter-2.2.4-2.5.noarch.rpm"
RPM_HASH = "a3e431b998b2e5485b7d25f462a91a56a9498adfb3283e1034b6de9904cec49fb701cc3d521cb55a0ca4ac1948327c2e44ffba278ca82f2154f824918bc9c6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hijri-converter \
python314-hijri-converter \
python3dist-hijri-converter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
