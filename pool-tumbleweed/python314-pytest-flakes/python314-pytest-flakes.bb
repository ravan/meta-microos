SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python314-pytest-flakes-4.0.5-2.5.noarch.rpm"
RPM_HASH = "0ef663c97b43d916576e1fc44482139536dc5f4f32b9e7f6f4fac27ddc6bf5cf01e92b1c54da1f176595151087044e048ce16598180b5859b25bf537ef27cb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-flakes \
python314-pytest-flakes \
python3dist-pytest-flakes"

RDEPENDS:${PN} += "python-abi \
python314-pyflakes \
python314-pytest"

inherit rpm
