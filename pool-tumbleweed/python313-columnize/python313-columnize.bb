SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python313-columnize-0.3.11-2.5.noarch.rpm"
RPM_HASH = "eab55a0229a91cfcd2f2fb3186a2a4882e8ff81c4ab361fd673b75913c2c57aa6141b98fcb53fac11cea1f187c61e772e6baf2f799308782b60efaaea0430d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-columnize \
python3.13dist-columnize \
python313-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
