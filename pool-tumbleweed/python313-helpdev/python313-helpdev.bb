SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "CC-BY-4.0 & MIT"

PV = "0.7.1"

RPM_NAME = "python313-helpdev-0.7.1-4.5.noarch.rpm"
RPM_HASH = "ae268ee66d0bd891c4563201a47c3853febb596eabfd671c0372ba2ff72aad43eb94b2f7195c2507725d201146c3092f21eccde25b44aa7bd66d8d1f2edafe5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-helpdev \
python3.13dist-helpdev \
python313-helpdev \
python3dist-helpdev"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-importlib-metadata \
python313-psutil"

inherit rpm
