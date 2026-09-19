SUMMARY = "Zinnia model files trained with data provided by Tomoe"
DESCRIPTION = "zinnia provides hand recognization model to Zinnia. This model \
supports Japanese and simplified Chinese."
LICENSE = "LGPL-2.1"

PV = "0.6.0"

RPM_NAME = "zinnia-tomoe-0.6.0-8.7.noarch.rpm"
RPM_HASH = "68d08feb46026ae0c0b87d61260e62725d17647eba150805660784e1cc23725632b0410c610b5d8af24c5cef3b609dd280a843b88320079f17e73e030238745e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zinnia-tomoe"

RDEPENDS:${PN} += ""

inherit rpm
