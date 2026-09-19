SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python313-derpconf-0.8.4-2.5.noarch.rpm"
RPM_HASH = "648a04348d7b4ca76983b85fe51ecba6255753a9543a85fd9b25ae63b0b50d388b70e6117ebb97ac5eb3a840f17cf21997c13aedac6553f81bb79559e5f339b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-derpconf \
python3.13dist-derpconf \
python313-derpconf \
python3dist-derpconf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
