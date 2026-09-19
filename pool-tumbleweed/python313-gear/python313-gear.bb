SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python313-gear-0.16.0-3.8.noarch.rpm"
RPM_HASH = "60423b2ac8e420cdff062040587524eadc7d54aba1c714763643bbe09c988c1efd3ad4c1cd36d13fbd70323e843c627e51c08cd1cc8780e1e07c52469981422f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gear \
python3.13dist-gear \
python313-gear \
python3dist-gear"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-extras \
python313-pbr \
python313-python-daemon \
python313-six \
update-alternatives"

inherit rpm
