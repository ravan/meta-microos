SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.4.2"

RPM_NAME = "python313-wafw00f-2.4.2-1.2.noarch.rpm"
RPM_HASH = "91cd4f96f84cd7fa27ab00e9585662008d758aa3d926f308f7fee24f29602a3c45da31258695464826658839f3e5574058ba517b99836be7e6ce1f7e3363e4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wafw00f \
python3.13dist-wafw00f \
python313-wafw00f \
python3dist-wafw00f"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-requests"

inherit rpm
