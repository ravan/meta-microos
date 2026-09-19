SUMMARY = "Named types"
DESCRIPTION = "Named types. \
 \
This library defines the Named protocol for types that contain the __name__ \
attribute, abstracting the attribute itself away."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python313-named-1.4.2-2.8.noarch.rpm"
RPM_HASH = "7576700831c90ccda203a92d36aad3c4f2680ca18ca05b017682f2b1d0b27f669a59bef0124735f3a735696b7d85da5b6923adb8aa465e1ca0b5ba125527bebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-named \
python3.13dist-named \
python313-named \
python3dist-named"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
