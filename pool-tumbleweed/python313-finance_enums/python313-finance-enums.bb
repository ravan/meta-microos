SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python313-finance_enums-0.1.0-3.5.noarch.rpm"
RPM_HASH = "b7f6ff032fbd881c5bb7c7ca418ea547c3db249a789011028cef6cbe9251611e171bd35c2b672ad4542d7b286867ca157e467211859ca8640cf99511ff2d952b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-finance-enums \
python3.13dist-finance-enums \
python313-finance-enums \
python3dist-finance-enums"

RDEPENDS:${PN} += "python-abi \
python313-pandas"

inherit rpm
