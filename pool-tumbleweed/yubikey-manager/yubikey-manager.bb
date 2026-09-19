SUMMARY = "Python 3 library and command line tool for configuring a YubiKey"
DESCRIPTION = "Python 3 library and command line tool for configuring a YubiKey. \
YubiKey Manager (ykman) is a command line tool for configuring a YubiKey over \
all transports. It is capable of reading out device information as well as \
configuring several aspects of a YubiKey, including enabling or disabling \
connection transports an programming various types of credentials."
LICENSE = "BSD-2-Clause"

PV = "5.8.0"

RPM_NAME = "yubikey-manager-5.8.0-1.4.noarch.rpm"
RPM_HASH = "81717b7ca6d4395158cbbede10c60e403705610a9525806d15823c75016aaa2b147a04078841ebc65186ce47d5c25b93647ecc94f1ce81235269883617fda92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yubikey-manager \
python3.13dist-yubikey-manager \
python3dist-yubikey-manager \
yubikey-manager"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-click \
python3-cryptography \
python3-fido2 \
python3-keyring \
python3-pyscard"

inherit rpm
