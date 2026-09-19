SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-sphinx-version-warning-1.1.2-3.5.noarch.rpm"
RPM_HASH = "adb6458e42fea73837404c7dd943f43d19334e1c86cd9fdbc36f6ef4bc69d1913e237d55509518a5418417d124e9b1bac6bd916ab2e5d2900f1da89fb6385516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-version-warning \
python3.13dist-sphinx-version-warning \
python313-sphinx-version-warning \
python3dist-sphinx-version-warning"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
