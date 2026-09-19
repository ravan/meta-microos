SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python314-pyotp-2.10.0-1.3.noarch.rpm"
RPM_HASH = "1cabccf55db0a15e0c0e8ab1c676c38753ad9f787e2b13e1f4166372c8fa803858e6f01de437250e2e8cf2a15317a31ab3bf7597b9ef26080050c1cf56c0aa0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyotp \
python314-pyotp \
python3dist-pyotp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
