SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-pegen-0.3.0-4.2.noarch.rpm"
RPM_HASH = "1f42936c4dfb2a200bd461b08364bbcaf4ed5b21a1ca2025072f883f4086fc0d086cd902a0f61f4810a040f7630c378500c93bfa8898d15c1b6f058706c630e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegen \
python3.13dist-pegen \
python313-pegen \
python3dist-pegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
