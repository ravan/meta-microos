SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-environmental-override-0.1.2-2.5.noarch.rpm"
RPM_HASH = "b948247c018112fe7f94bcd05d4675698b6444a3ea8d0e9f04a1a8d914b710fbd8a139076964f267afd6e37eb5bfc46da7455dbf57e4b8ebf91bda9eae213b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-environmental-override \
python314-environmental-override \
python3dist-environmental-override"

RDEPENDS:${PN} += "python-abi"

inherit rpm
