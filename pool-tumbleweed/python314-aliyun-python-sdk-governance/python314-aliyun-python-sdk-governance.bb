SUMMARY = "The governance module of Aliyun Python SDK"
DESCRIPTION = "The governance module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python314-aliyun-python-sdk-governance-1.0.0-1.8.noarch.rpm"
RPM_HASH = "6a4665cb3864d1b35a6f49f5ce418c18bff7e8c429ca825629026ac9035dd6f89aa79b1ab2bf3b8a1cbf5e12f9f5412020d25ea98f61f4106a65b5c403ae94cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aliyun-python-sdk-governance \
python314-aliyun-python-sdk-governance \
python3dist-aliyun-python-sdk-governance"

RDEPENDS:${PN} += "python-abi \
python314-aliyun-python-sdk-core"

inherit rpm
