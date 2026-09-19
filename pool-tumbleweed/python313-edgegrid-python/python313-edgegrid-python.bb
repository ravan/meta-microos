SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "2.0.5"

RPM_NAME = "python313-edgegrid-python-2.0.5-1.2.noarch.rpm"
RPM_HASH = "eb2828a231f4262f99acb21973fd4b28bf7308bc3daada0d282557ed1deaca26009ee9630526e6835d1ccbadf095cd651feb89b7e499473dad0b76e0d05de218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edgegrid-python \
python3.13dist-edgegrid-python \
python313-edgegrid-python \
python3dist-edgegrid-python"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-requests-toolbelt"

inherit rpm
