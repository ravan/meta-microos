SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-azure-digitaltwins-core-1.3.0-1.5.noarch.rpm"
RPM_HASH = "549c6597bbe0ab66c71bad683602815d070faed9f5cd7381d52c8334c21cd82521570bff1579ae1a01c788c151acb18ff26e129433c94b131c5badd111a675f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-digitaltwins-core \
python3.13dist-azure-digitaltwins-core \
python313-azure-digitaltwins-core \
python3dist-azure-digitaltwins-core"

RDEPENDS:${PN} += "-python313-azure-core >= 1.29.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-digitaltwins-nspkg \
python313-azure-nspkg"

inherit rpm
