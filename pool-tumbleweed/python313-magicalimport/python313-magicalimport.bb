SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python313-magicalimport-0.9.2-1.6.noarch.rpm"
RPM_HASH = "216d2021342b55dfe006320358bebc1790a92e7d60f81244aa5606b7526271f04f326d72b0e0c4d19e64b1a0b1ef4bcdafc3efd16e10e4b02ed00d8fd5d2b6a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magicalimport \
python3.13dist-magicalimport \
python313-magicalimport \
python3dist-magicalimport"

RDEPENDS:${PN} += "python-abi"

inherit rpm
