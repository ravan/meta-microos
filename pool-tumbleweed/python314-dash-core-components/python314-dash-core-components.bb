SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-dash-core-components-2.0.0-2.5.noarch.rpm"
RPM_HASH = "4ac519d4551c635ce932ff5fcf4c6fc2d810e9db9ebdc5918020e78b30ae8effa8c5f7330880f6f705051e78b50bd39f5ab4048745a18b8dd90b21c0a48b9009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dash-core-components \
python314-dash-core-components \
python3dist-dash-core-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
