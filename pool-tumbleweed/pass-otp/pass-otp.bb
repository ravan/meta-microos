SUMMARY = "A pass extension for managing one-time-password (OTP) tokens"
DESCRIPTION = "A pass extension for managing one-time-password (OTP) tokens. \
More information may be found in the pass-otp(1) man page."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "pass-otp-1.2.0-3.7.noarch.rpm"
RPM_HASH = "e33cd9bef2b4fc835628464388ee64005d1e3dacdeddd5ea4aa13e721a7d9455a50baca87ea7dde3fdb51e242b1a53df1135ec3e2a80b38cb35e11c4df2778df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pass-otp"

RDEPENDS:${PN} += "/usr/bin/bash \
oath-toolkit \
password-store \
qrencode"

inherit rpm
