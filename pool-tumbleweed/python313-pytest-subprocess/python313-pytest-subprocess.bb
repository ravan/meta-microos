SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-pytest-subprocess-1.6.0-1.2.noarch.rpm"
RPM_HASH = "c5d7c410aa24814bb05d73d119a5a7b797dddca4af38a4298caf88135863e027613f1b8b84af9b5f1d3a84a37c1bff5aca84c66acccece655025d541ddb6ec97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-subprocess \
python3.13dist-pytest-subprocess \
python313-pytest-subprocess \
python3dist-pytest-subprocess"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
