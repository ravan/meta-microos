SUMMARY = "Query SUSE Public Cloud Info Service"
DESCRIPTION = "Query the SUSE Public Cloud Information Service REST API"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "python-susepubliccloudinfo-1.4.2-1.3.noarch.rpm"
RPM_HASH = "90eb1846901ae869e9e1512624f2e9db131cef04c44e5a8122f09463009c7e018a45f43e8fe530b5e0703db506e717acbca0a51540acf762c2a3dfc88a64ab9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-susepubliccloudinfo \
python3.13dist-susepubliccloudinfo \
python3dist-susepubliccloudinfo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313 \
python313-docopt \
python313-lxml \
python313-requests"

inherit rpm
