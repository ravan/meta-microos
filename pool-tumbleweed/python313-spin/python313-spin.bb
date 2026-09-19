SUMMARY = "Developer tool for scientific Python libraries"
DESCRIPTION = "Developer tool for scientific Python libraries"
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python313-spin-0.8-1.12.noarch.rpm"
RPM_HASH = "775c753cbd4b4cd804d625e907a78edc211c131a39cc8b0b94954c50d97355c0dda86585bbd3c3c1263fb84173a6a8f70839b36bde3a409689cb56866c6bbe46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spin \
python3.13dist-spin \
python313-spin \
python3dist-spin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
update-alternatives"

inherit rpm
