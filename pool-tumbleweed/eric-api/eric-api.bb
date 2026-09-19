SUMMARY = "API files for eric6"
DESCRIPTION = "This package provides API files for eric6. \
If both python-eric6 and python3-eric6 packages are installed then only one \
python-eric6-api or python3-eric6-api is needed."
LICENSE = "GPL-3.0-or-later"

PV = "25.3"

RPM_NAME = "eric-api-25.3-2.4.noarch.rpm"
RPM_HASH = "c8aa4e703cb63323f0c6b103367be8f76b04286d6417c34d96e6ec63e1e44a5e8d3f43f534294f29260ace70a075c71cd99c9348d70153011c13fe1377d38ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eric-api \
eric5-api \
eric6-api \
python-eric5-api \
python-eric6-api"

RDEPENDS:${PN} += ""

inherit rpm
