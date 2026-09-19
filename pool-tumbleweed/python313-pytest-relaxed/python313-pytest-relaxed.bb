SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.2"

RPM_NAME = "python313-pytest-relaxed-2.0.2-3.5.noarch.rpm"
RPM_HASH = "13c0edec49864bd94ab2f5b60bd2afc75c43e9d72d4cf933538cd61fa9dbba0a2302c21c611d8cc19e6f6baf2713d364872728662fe0cfc14ff9e6a69a352905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-relaxed \
python3.13dist-pytest-relaxed \
python313-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python313-decorator \
python313-pytest"

inherit rpm
