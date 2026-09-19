SUMMARY = "Typing stubs for PyYAML"
DESCRIPTION = "Typing stubs for PyYAML"
LICENSE = "Apache-2.0"

PV = "6.0.12.20240917"

RPM_NAME = "python313-types-PyYAML-6.0.12.20240917-2.5.noarch.rpm"
RPM_HASH = "16311471e5be09164f5de9b0580467977afe0f6ff9ec4800a60393061e3f0ce5832330a15731d971db3b3662a930964f6b54109b0d772d765a9cc1b1fedd914c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-types-PyYAML \
python3.13dist-types-pyyaml \
python313-types-PyYAML \
python3dist-types-pyyaml"

RDEPENDS:${PN} += ""

inherit rpm
