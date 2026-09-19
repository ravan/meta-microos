SUMMARY = "Detect platforms and group them by family"
DESCRIPTION = "Detect platforms and group them by family"
LICENSE = "Apache-2.0"

PV = "13.6.0"

RPM_NAME = "python314-extra-platforms-13.6.0-1.1.noarch.rpm"
RPM_HASH = "044429ffe2342eb3fbde4564eea154e64a5db8af41f5bc2b22552d2efa6ace4a366c6405df65e206cf56e3fde58a9d60f31e5bd7cdd819e7b00c08dc03fa99b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-extra-platforms \
python314-extra-platforms \
python3dist-extra-platforms"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
