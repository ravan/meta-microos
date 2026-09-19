SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.2"

RPM_NAME = "python314-pytest-relaxed-2.0.2-3.5.noarch.rpm"
RPM_HASH = "f317e27dccb0c81567e8e967cd5741d3a311288846ff9bb051bafda288ee7ad80791d11084b125f951b66a16f3e630048bd24e5e2d13ad0126edba571b0fbcd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-relaxed \
python314-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python314-decorator \
python314-pytest"

inherit rpm
