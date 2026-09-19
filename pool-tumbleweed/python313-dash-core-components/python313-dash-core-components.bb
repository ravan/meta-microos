SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-dash-core-components-2.0.0-2.5.noarch.rpm"
RPM_HASH = "3f292e7a52507d46de4ee21c26b7467de5395d7d5ec237ca1f5551668e790b817d9d81a386e23012abfc40729eb6a83223e35effb7089bf7e2e180f01e2232d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-core-components \
python3.13dist-dash-core-components \
python313-dash-core-components \
python3dist-dash-core-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
