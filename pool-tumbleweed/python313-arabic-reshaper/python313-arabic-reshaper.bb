SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-arabic-reshaper-3.0.0-2.12.noarch.rpm"
RPM_HASH = "ac17dab0bea397f3a1462a2f2f8d4bdebd1ff28a6f127896859489decc6ec8940d60c46395b9f270223722a1bd86ab5d048d0c3717a92f98f63b35568dcb5236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arabic-reshaper \
python3.13dist-arabic-reshaper \
python313-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
