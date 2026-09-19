SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python313-agate-dbf-0.2.4-1.4.noarch.rpm"
RPM_HASH = "13e8d5b9adc5e8b98e430613aacdafbffeb127e39e8b0d886a8228519510aadcca11a4060265ee0e07247962aa33e2c88296fddb4e594f93643d84f7c7382846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-dbf \
python3.13dist-agate-dbf \
python313-agate-dbf \
python3dist-agate-dbf"

RDEPENDS:${PN} += "python-abi \
python313-agate \
python313-dbfread"

inherit rpm
