SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "python313-specfile-0.41.0-1.2.noarch.rpm"
RPM_HASH = "ec269d9f817272409e8e62c0e35f8c76ba7502f906d29a53691242d7debee3248c8fa020a2c4ddff03b502d0a856ddf5933ff58c423099dd997a90e8f12f385b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-specfile \
python3.13dist-specfile \
python313-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python313-rpm"

inherit rpm
