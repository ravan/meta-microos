SUMMARY = "Plugin for pytest to create data files"
DESCRIPTION = "pytest plugin to create a 'tmp_path' containing predefined files/directories."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-pytest-datafiles-3.0.1-1.3.noarch.rpm"
RPM_HASH = "c6765e89249f87b9775f1fd74a0d5c92b3900f36bffd2fdc5deed02440d4d698af8ae9ab9cfb3e67c03e0f210902f64c8bbbed7628b40e37755cdf83123547dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-datafiles \
python314-pytest-datafiles \
python3dist-pytest-datafiles"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
