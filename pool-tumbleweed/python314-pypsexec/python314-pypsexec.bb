SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-pypsexec-0.3.0-4.5.noarch.rpm"
RPM_HASH = "b62323f1824f66eec7639e20b8709896a9c6cf12898dd6a7be68fc26dbe3e6d919351a1469e570a17da8e4fdb2252f22dd94eac4c390fa56fbc8053ee04f42af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypsexec \
python314-pypsexec \
python3dist-pypsexec"

RDEPENDS:${PN} += "python-abi \
python314-smbprotocol"

inherit rpm
