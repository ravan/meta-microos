SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-pytest-subprocess-1.6.0-1.2.noarch.rpm"
RPM_HASH = "1bf1ff96b3972bf5d071f683530cecdd4d253c44372dad078631f5a8122c8070dcf2e43ef4340397820b85aa3b8009356ad02630a8c92fa51251df1d90c0997a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-subprocess \
python314-pytest-subprocess \
python3dist-pytest-subprocess"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
