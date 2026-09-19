SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python313-getmac-0.9.5-1.9.noarch.rpm"
RPM_HASH = "10a655ff7c8a2f1308f14d48df7f9e02fdca607b35183dd580eefd1b184589fa94bfea06d927d634cdeb27fc4402cee650155a888a23350f77f9e170dcc3e842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-getmac \
python3.13dist-getmac \
python313-getmac \
python3dist-getmac"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
