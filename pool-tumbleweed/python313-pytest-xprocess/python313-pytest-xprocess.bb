SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python313-pytest-xprocess-1.0.2-3.5.noarch.rpm"
RPM_HASH = "76395bf14c655be24250d0b47612fb90608c160527954caf04e4cbdb6d45f21744fa233745e267a04a1621feedc50bedba17b6dd9164b72169777b61ce79fa68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xprocess \
python3.13dist-pytest-xprocess \
python313-pytest-xprocess \
python3dist-pytest-xprocess"

RDEPENDS:${PN} += "python-abi \
python313-psutil \
python313-pytest"

inherit rpm
