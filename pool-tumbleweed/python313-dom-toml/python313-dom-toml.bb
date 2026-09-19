SUMMARY = "Dom's tools for Tom's Obvious, Minimal Language"
DESCRIPTION = "Dom's tools for Tom's Obvious, Minimal Language."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-dom-toml-2.3.0-1.2.noarch.rpm"
RPM_HASH = "f1c62e4b57360cebb22540083aff099f4ebda16a8a68ae5f8852d8face4e0b2a0c15f0246b920ecd59697cf5a8327bd25ce658176f954f8b28b1a657d4d3afc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dom-toml \
python3.13dist-dom-toml \
python313-dom-toml \
python3dist-dom-toml"

RDEPENDS:${PN} += "python-abi \
python313-domdf-python-tools \
python313-tomli-w"

inherit rpm
