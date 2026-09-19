SUMMARY = "Vector/OTF versions of the Terminus bitmap fonts"
DESCRIPTION = "The Terminus bitmap fonts, provided in OpenType vector format. \
Both original (jagged-edge) and smooth-edge variants are provided."
LICENSE = "OFL-1.1"

PV = "4.49.1"

RPM_NAME = "consoleet-terminus-fonts-4.49.1-1.14.noarch.rpm"
RPM_HASH = "b692f50272fc4d6db02396efab0c920b04750a7d6d16e771828d824494bbc468c9cb2bae5ff775df662952db1fc5445015e4bc2d827ed7fc22c55f5e25644ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-consoleet-terminus-fonts \
consoleet-terminus-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
