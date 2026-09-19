SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python314-proglog-0.1.12-1.5.noarch.rpm"
RPM_HASH = "20475065924bd6f7f20608a3d53fd375baea5964091ca11ba80de8494dfe74e55e54906bd9094f695a9c4898d8b28d235c387bde25796ee4759a92ea267883a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proglog \
python314-proglog \
python3dist-proglog"

RDEPENDS:${PN} += "python-abi \
python314-tqdm"

inherit rpm
