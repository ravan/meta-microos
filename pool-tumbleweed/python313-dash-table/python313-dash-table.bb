SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python313-dash-table-5.0.0-2.5.noarch.rpm"
RPM_HASH = "8aa586c371ebbdcf96bddb5f2f5ec717417015bf22ca4353981f37e93fd6205fb4f06b526c3a3f81d9190a6025c95b405b64743e6950a7f61f6ce8230cf6cfb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-table \
python3.13dist-dash-table \
python313-dash-table \
python3dist-dash-table"

RDEPENDS:${PN} += "python-abi"

inherit rpm
