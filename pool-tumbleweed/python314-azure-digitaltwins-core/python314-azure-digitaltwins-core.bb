SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-azure-digitaltwins-core-1.3.0-1.5.noarch.rpm"
RPM_HASH = "a0cfe167c5fd6cb8b6ff7e78e39c9d0da11f6e1ed60e187d283c565ffd2239b68946978416a7f7ed260e17428890af79b6c5aed79ae2a44d0a70484ccfe32a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-digitaltwins-core \
python314-azure-digitaltwins-core \
python3dist-azure-digitaltwins-core"

RDEPENDS:${PN} += "-python314-azure-core >= 1.29.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-digitaltwins-nspkg \
python314-azure-nspkg"

inherit rpm
