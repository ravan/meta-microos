SUMMARY = "Source Han Sans variation for Traditional Chinese in Hong Kong"
DESCRIPTION = "Source Han Sans is a pan-CJK typeface in OpenType/CFF and CID forms."
LICENSE = "OFL-1.1"

PV = "2.005"

RPM_NAME = "adobe-sourcehansans-hk-fonts-2.005-1.3.noarch.rpm"
RPM_HASH = "35c424afd55fa076b19f1ec69fedabb079ee0c15970d2c101f0dd68aa908507d714965b91963dd4115bef204867615c072c2271392cb2ed68cb4ef202d5032db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-hk-fonts \
locale-zh-HK \
scalable-font-zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
