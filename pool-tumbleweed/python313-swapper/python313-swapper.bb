SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-swapper-1.4.0-1.7.noarch.rpm"
RPM_HASH = "210a4310bb1eb037f32a283c59c70b80d1ad02955949cd3923fd608f40c7b688a46cae547a85bf4ee0f87663f0605ec79681b4a47627e9fb8bc4c43f8f1d11f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swapper \
python3.13dist-swapper \
python313-swapper \
python3dist-swapper"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
