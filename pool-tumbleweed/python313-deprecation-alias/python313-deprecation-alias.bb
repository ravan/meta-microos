SUMMARY = "A wrapper around 'deprecation' providing support for deprecated aliases"
DESCRIPTION = "A wrapper around 'deprecation' providing support for deprecated aliases."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python313-deprecation-alias-0.4.0-1.3.noarch.rpm"
RPM_HASH = "abd421c4f8a2fd0aa073db65a40661d1eccc49d83cbd8e001fe848b4f612ed871fe068071f313d77f784a4ad9c1e383cec08839c5ae1aac0b44fd39405707649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deprecation-alias \
python3.13dist-deprecation-alias \
python313-deprecation-alias \
python3dist-deprecation-alias"

RDEPENDS:${PN} += "python-abi \
python313-deprecation \
python313-packaging"

inherit rpm
