SUMMARY = "CLI tools for stamping and signing PDF files"
DESCRIPTION = "CLI tools for stamping and signing PDF files"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python313-pyhanko-cli-0.4.2-1.1.noarch.rpm"
RPM_HASH = "c6424de84e3b55c4afbc4e023b07940c1968f746f55b84b43382f2d6f00c0c3edc5eba074c49a4757531af347bea200dca8e66b7e041a4602b4066a42accdd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhanko-cli \
python3.13dist-pyhanko-cli \
python313-pyhanko-cli \
python3dist-pyhanko-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-asn1crypto \
python313-certifi \
python313-click \
python313-platformdirs \
python313-pyhanko \
python313-pyhanko-certvalidator \
python313-tzlocal \
update-alternatives"

inherit rpm
