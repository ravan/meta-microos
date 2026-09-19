SUMMARY = "Pure Python Adb Library"
DESCRIPTION = "Pure Python Adb Library"
LICENSE = "MIT"

PV = "2.12.0"

RPM_NAME = "python313-adbutils-2.12.0-1.1.noarch.rpm"
RPM_HASH = "f26fdee1138772fe0a09fde62d581364d6a7c38fa9350be59060c13971dc5a9ca7b220c7cea7bcd2b48860f3ea949ea13f8d1fc40504a2386941cf41302c4ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-adbutils \
python3.13dist-adbutils \
python313-adbutils \
python3dist-adbutils"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-deprecation \
python313-requests \
python313-retry"

inherit rpm
