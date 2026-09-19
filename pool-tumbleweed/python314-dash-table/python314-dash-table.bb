SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python314-dash-table-5.0.0-2.5.noarch.rpm"
RPM_HASH = "68a36aad48b05d38c1527b87a4745889519a3f8eba069c7d5ac292cce4d4f75192f29b1c4c21c7467ccf2a38b151b8195a20dd05de88c34e349cc550509efbb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dash-table \
python314-dash-table \
python3dist-dash-table"

RDEPENDS:${PN} += "python-abi"

inherit rpm
