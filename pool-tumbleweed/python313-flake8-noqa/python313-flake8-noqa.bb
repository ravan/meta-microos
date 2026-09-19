SUMMARY = "Flake8 noqa comment validation"
DESCRIPTION = "Flake8 noqa comment validation"
LICENSE = "LGPL-3.0-only"

PV = "1.5.0"

RPM_NAME = "python313-flake8-noqa-1.5.0-1.4.noarch.rpm"
RPM_HASH = "eb3787b0288d27c4bd682d41aac274e8640604cdb0bd6e4a14c700ed51ed1b0020cd2231ebb544caaeb150f8de8179f6ed1a2dd60e37958e684ecd2783028f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-noqa \
python3.13dist-flake8-noqa \
python313-flake8-noqa \
python3dist-flake8-noqa"

RDEPENDS:${PN} += "python-abi \
python313-flake8 \
python313-typing-extensions"

inherit rpm
