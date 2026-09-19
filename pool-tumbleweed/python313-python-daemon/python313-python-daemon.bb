SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, \
'Standard daemon process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required \
steps are much the same for every daemon program. A DaemonContext instance \
holds the behaviour and configured process environment for the program; use the \
instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "3.1.2"

RPM_NAME = "python313-python-daemon-3.1.2-1.3.noarch.rpm"
RPM_HASH = "7d018907a5ef15a3e529cd513ceea2caf9d305496ff835bc302a09f807225af47f75be775c245df54cc5a805cbe2550f1b74db6dd10a74ae18e4f9391933cb69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-daemon \
python3.13dist-python-daemon \
python313-python-daemon \
python3dist-python-daemon"

RDEPENDS:${PN} += "python-abi \
python313-lockfile"

inherit rpm
