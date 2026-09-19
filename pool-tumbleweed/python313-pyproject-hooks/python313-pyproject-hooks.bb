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

RPM_NAME = "python313-pyproject-hooks-1.2.0-2.1.noarch.rpm"
RPM_HASH = "d78e96b04b5600317770b3d7d9c540df1cd64c8b065d1a8f6d008a4aa59513c556c0cf4bdd4654e59b15e4e1c825f4a0b92e9614154695fffb63e0e1723b0a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-hooks \
python3.13dist-pyproject-hooks \
python313-pyproject-hooks \
python3dist-pyproject-hooks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
