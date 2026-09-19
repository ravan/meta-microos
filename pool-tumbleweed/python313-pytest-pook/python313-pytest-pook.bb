SUMMARY = "Pytest plugin for pook"
DESCRIPTION = "A pytest plugin for pook. \
 \
Tests that rely on pook can be marked with @pytest.mark.pook."
LICENSE = "LGPL-3.0"

PV = "1.0.0"

RPM_NAME = "python313-pytest-pook-1.0.0-1.2.noarch.rpm"
RPM_HASH = "2bee7921c270fb881e8540c896d83dee3f1064b0aa0d53f743342b77fe229fd1a46ad915d5360c9eaa90a0c952b360e1d7f104c6bce0688d9aeaf5e8c6b76c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pook \
python3.13dist-pytest-pook \
python313-pytest-pook \
python3dist-pytest-pook"

RDEPENDS:${PN} += "python-abi \
python313-pook \
python313-pytest"

inherit rpm
