SUMMARY = "Source Han Sans variation for Simplified Chinese"
DESCRIPTION = "Source Han Sans is a pan-CJK typeface in OpenType/CFF and CID forms."
LICENSE = "OFL-1.1"

PV = "2.005"

RPM_NAME = "adobe-sourcehansans-cn-fonts-2.005-1.3.noarch.rpm"
RPM_HASH = "8ce1fbe3584e22be1d82ef1bd4cffce2428d0cac1ddd21cce37ad014a54b063e60f4da819c187215fade278ab77ff5d8b4d9b52b3c79000959a82a3efa62f446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-cn-fonts \
locale-zh-CN \
scalable-font-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
