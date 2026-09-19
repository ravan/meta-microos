SUMMARY = "Wrappers to call pyproject.toml-based build backend hooks"
DESCRIPTION = "This is a low-level library for calling build-backends in ``pyproject.toml``-based project. \
It provides the basic functionality to help write tooling that generates distribution files from Python projects. \
 \
If you want a tool that builds Python packages, you'll want to use https://github.com/pypa/build instead. \
This is an underlying piece for `pip`, `build` and other 'build frontends' use to call 'build backends' within them. \
 \
Note: The ``pep517`` project has been replaced by this project (low level) and the ``build`` project (high level)."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-pyproject-hooks-1.2.0-2.1.noarch.rpm"
RPM_HASH = "e0f4e3619560db16679b09ee9de71a6a28f7616acdb4c16b181bdec485a5800b5171cce2c32ee4f0374e55d5210b963dee99ea2712f3358a77655436092d6465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyproject-hooks \
python314-pyproject-hooks \
python3dist-pyproject-hooks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
