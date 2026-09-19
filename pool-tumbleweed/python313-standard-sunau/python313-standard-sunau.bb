SUMMARY = "Standard library sunau redistribution. 'dead battery'"
DESCRIPTION = "Standard library sunau redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python313-standard-sunau-3.13.0-2.4.noarch.rpm"
RPM_HASH = "38dced3d65004297d2a903bd710d76db6c8984f95428eb6c67a7d54059fb7ceff64c86303ee41df75ba4cd890a07b06d944ecfdc045b86719422c663637f9b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-standard-sunau \
python3.13dist-standard-sunau \
python313-standard-sunau \
python3dist-standard-sunau"

RDEPENDS:${PN} += "python-abi \
python313-audioop-lts"

inherit rpm
