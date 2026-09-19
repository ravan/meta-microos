SUMMARY = "Documentation for python-bpython"
DESCRIPTION = "Documentation and help files for python-bpython."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "python-bpython-doc-0.26-4.2.noarch.rpm"
RPM_HASH = "8befa0bf1598138fb8d67cf725961f7a0716100eab8eb8264bf4f3071b9f96fc2b0f04fa5ace7ea49a26370d9db3e3d2d034f33d35fdb191310595cdf9b00428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-doc \
python313-bpython-doc \
python314-bpython-doc"

RDEPENDS:${PN} += ""

inherit rpm
