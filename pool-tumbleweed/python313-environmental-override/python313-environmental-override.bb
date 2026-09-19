SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-environmental-override-0.1.2-2.5.noarch.rpm"
RPM_HASH = "6736d99536e5d70389add7ea2235185434d2af5875d219c9031ada163d0b72c9ab905fbcf516233260d10b53cda70d5b7966907ba259bb5ef9b2227cdfc80d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environmental-override \
python3.13dist-environmental-override \
python313-environmental-override \
python3dist-environmental-override"

RDEPENDS:${PN} += "python-abi"

inherit rpm
