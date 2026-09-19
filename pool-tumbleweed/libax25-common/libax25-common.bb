SUMMARY = "Common files for libax25"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators. \
 \
This package contains common config files for libax25."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-common-0.0.12~rc5-2.6.noarch.rpm"
RPM_HASH = "d215d0a5963b62a945b31bc46d8eafd974cd258725bb59e934ab58b8a48308d820810aecd4aa368286391d4f545cf0d888c05a21adb9448460a36e0c62b4f1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libax25-common \
libax25-common"

RDEPENDS:${PN} += ""

inherit rpm
