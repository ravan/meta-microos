SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python313-pyotp-2.10.0-1.3.noarch.rpm"
RPM_HASH = "5dcf2d7b813dcfd21a3f67c9187190964df3c9950bf4c52ab29dc032496aa00cd162380a43f5f65f0a5d57a6f9ec1c64d7b13eb0193ed0424e05faf57ca6eab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyotp \
python3.13dist-pyotp \
python313-pyotp \
python3dist-pyotp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
