SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-azure-communication-phonenumbers-1.4.0-1.5.noarch.rpm"
RPM_HASH = "4182fc2d9383a3de98beedde15a6aec84ac96f6d5eebd07c2b2c75a8f9992c74f83c64166c2818cd50139d355f66450074eda7184f8929ff1f47bcd77ba64aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-phonenumbers \
python314-azure-communication-phonenumbers \
python3dist-azure-communication-phonenumbers"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
