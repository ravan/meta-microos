SUMMARY = "XFCE Desktop Environment"
DESCRIPTION = "Xfce is a lightweight desktop environment for various *NIX systems."
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce-20230212-12.3.aarch64.rpm"
RPM_HASH = "9f2069d1eceb990a428506aca9b45c347b2b6b9b953b01401904eec842fbe9e0d44f03d3b4fd5326aa0a2cff74396c34be4b20a9607a86340630efded7c7f7ef"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-xfce \
patterns-xfce-xfce"

RDEPENDS:${PN} += "pattern-"

inherit rpm
