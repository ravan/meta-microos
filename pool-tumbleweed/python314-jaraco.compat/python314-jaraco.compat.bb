SUMMARY = "Modules providing forward compatibility across Python versions"
DESCRIPTION = "Modules providing forward compatibility across Python versions"
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python314-jaraco.compat-4.3.1-1.4.noarch.rpm"
RPM_HASH = "1ca96116ea62179ec9b13856fbb10d0942945125e2819242ae3df999c3d928a4f87b23dd6a4241f3d389851fff7d4261e3a5a5bcc5eaf774f7ca9ac2357233ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.compat \
python314-jaraco.compat \
python3dist-jaraco.compat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
