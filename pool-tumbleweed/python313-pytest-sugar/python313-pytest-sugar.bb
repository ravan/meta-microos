SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python313-pytest-sugar-1.1.1-2.4.noarch.rpm"
RPM_HASH = "278f8af718efca010c43c3a5a75cced9afe7c6489aa15fe8e5d60e9cc9e309afbe246d075630afb090820cf522069d4bc42beadbbba1d0619aa8d45d8d27ce96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sugar \
python3.13dist-pytest-sugar \
python313-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-termcolor"

inherit rpm
