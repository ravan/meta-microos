SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-pytest-git-1.8.0-1.8.noarch.rpm"
RPM_HASH = "158347d55ba6674b52a37dc63bc7fe7fa935f5551d78ea246f5d32407f072ee49552e0ae7e8935831da25acf0f1f478b3af15f236c4043ed96220c11b074c840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-git \
python314-pytest-git \
python3dist-pytest-git"

RDEPENDS:${PN} += "python-abi \
python314-GitPython \
python314-pytest \
python314-pytest-shutil"

inherit rpm
