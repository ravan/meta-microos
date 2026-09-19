SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-pathtools-0.1.2-16.12.noarch.rpm"
RPM_HASH = "ad1ca0ba154609d48bc788bd1d133f09cdb086c3a79eac323834694fe851bdf82a96cd1bd27631fb07d8198c25fe4af9b5845f91cf0ba9adc12a201eb6b9d76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathtools \
python3.13dist-pathtools \
python313-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
