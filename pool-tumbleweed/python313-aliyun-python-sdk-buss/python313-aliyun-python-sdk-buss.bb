SUMMARY = "The buss module of Aliyun Python SDK"
DESCRIPTION = "The buss module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python313-aliyun-python-sdk-buss-1.0.0-1.8.noarch.rpm"
RPM_HASH = "87e5eddf996fe022a2e9c5c7f460d65869afa3f402de29d98a6b824874b57b3760bd55fce3fa2488536c35cbdc031ad40e9c456321a0ca786772664d61701552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aliyun-python-sdk-buss \
python3.13dist-aliyun-python-sdk-buss \
python313-aliyun-python-sdk-buss \
python3dist-aliyun-python-sdk-buss"

RDEPENDS:${PN} += "python-abi \
python313-aliyun-python-sdk-core"

inherit rpm
