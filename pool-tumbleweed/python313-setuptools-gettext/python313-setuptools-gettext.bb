SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.18"

RPM_NAME = "python313-setuptools-gettext-0.1.18-1.2.noarch.rpm"
RPM_HASH = "802726f69be97b0efce815875d44ea0bd7321ee6433c13cd71c32605538292f25910ce4481b58c90a3635f4eceeba2519218f54fdfebb2b99c74de1ddbca1766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-gettext \
python3.13dist-setuptools-gettext \
python313-setuptools-gettext \
python3dist-setuptools-gettext"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
