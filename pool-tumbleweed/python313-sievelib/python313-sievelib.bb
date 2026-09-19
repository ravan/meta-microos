SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-sievelib-1.5.0-1.3.noarch.rpm"
RPM_HASH = "2cef0db9b3b6843ca6849d589259bdb356010096c8721ffc66352ad64577456443cfdaccafc2cf96e3fcd2c718ceea8259171a7017953eb417cdca37dcac587d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sievelib \
python3.13dist-sievelib \
python313-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
