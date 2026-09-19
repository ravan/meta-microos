SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python313-click-spinner-0.1.10-3.12.noarch.rpm"
RPM_HASH = "8c3fc5b20de2d744fee896d0527f4e26b85dabb94c29fbb72969ea75ddb07b9fd67b22fd9f7d0bff3d20df8ce1c74684e9e67f52a29b76dc6d4d95353dd01686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-spinner \
python3.13dist-click-spinner \
python313-click-spinner \
python3dist-click-spinner"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
