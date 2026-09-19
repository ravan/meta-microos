SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.83"

RPM_NAME = "python313-reconfigure-0.1.83-1.10.noarch.rpm"
RPM_HASH = "7f90d6743a1a686379385eec64ff99d839b314dfb2b87ecbc77f0898c8cd7cdd118af885c03abafb49bb78c3f51e6a36be8e9e6fec131627f0da7ac7c8ca9192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reconfigure \
python3.13dist-reconfigure \
python313-reconfigure \
python3dist-reconfigure"

RDEPENDS:${PN} += "python-abi \
python313-chardet"

inherit rpm
