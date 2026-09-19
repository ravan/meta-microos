SUMMARY = "Standard Webhooks"
DESCRIPTION = "Standard Webhooks"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-standardwebhooks-1.0.1-1.3.noarch.rpm"
RPM_HASH = "b91bebfce9ca2e5ac5249305161f455b0c97c009a93ef745b3ea60eff7579f21feeeebe93f4feb3dc60d6f92095ed692e60afcdf2bfbd8b3ac96b6aa7e2bd3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-standardwebhooks \
python3.13dist-standardwebhooks \
python313-standardwebhooks \
python3dist-standardwebhooks"

RDEPENDS:${PN} += "python-abi \
python313-Deprecated \
python313-attrs \
python313-httpx \
python313-python-dateutil"

inherit rpm
