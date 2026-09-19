SUMMARY = "FTP Transport Adapter for Requests"
DESCRIPTION = "Requests-FTP is an implementation of a very stupid FTP transport adapter for \
use with the `Requests` Python library. \
 \
This library is *not* intended to be an example of Transport Adapters best \
practices. This library was cowboyed together in about 4 hours of total work, \
has no tests, and relies on a few ugly hacks. Instead, it is intended as both \
a starting point for future development and an example for how to \
implement transport adapters."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python313-requests-ftp-0.3.1-4.5.noarch.rpm"
RPM_HASH = "b31445dd02948a3104daab95c046a0b251691e69c7a50d8967ff3ffbfc233efa75856938b593f1700fc6d8bd3082ba5ff1408c9ad31184351a82e662fbca7b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-ftp \
python3.13dist-requests-ftp \
python313-requests-ftp \
python3dist-requests-ftp"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
