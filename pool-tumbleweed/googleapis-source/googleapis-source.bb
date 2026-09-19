SUMMARY = "Source code of googleapis"
DESCRIPTION = "Googleapis are the interface definitions of public Google APIs that support \
both REST and gRPC protocols. \
 \
This package contains source code for googleapis."
LICENSE = "Apache-2.0"

PV = "20190724"

RPM_NAME = "googleapis-source-20190724-1.18.noarch.rpm"
RPM_HASH = "f7908dea5a0813771a3380a1df2fadedfcec5354f0afa7e9c804eb5c30cdc966451a038c4a9a907e015657bbb283050eda8be952e5d830c0678ec9a87e428201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "googleapis-source"

RDEPENDS:${PN} += ""

inherit rpm
