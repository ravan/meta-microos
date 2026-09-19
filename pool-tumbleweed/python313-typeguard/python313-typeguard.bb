SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.5.2"

RPM_NAME = "python313-typeguard-4.5.2-2.1.noarch.rpm"
RPM_HASH = "b3386eb2a535c699a59fdd7141d63dd254248eea0a2410db2658aa64f1bd333f83f1b58f9f156258e99a208090e1d336ccc536ec2f875f30d92eb395a4946956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typeguard \
python3.13dist-typeguard \
python313-typeguard \
python3dist-typeguard"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
