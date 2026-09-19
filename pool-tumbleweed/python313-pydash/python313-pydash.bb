SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "8.0.6"

RPM_NAME = "python313-pydash-8.0.6-2.2.noarch.rpm"
RPM_HASH = "03165f902a0b9fc8573d8c965519df717caabe1212985aecdd8d38d798bb726dec177a5c38db04e826d305dd693aa75dd81ed4fab33a9c08679f9974ad9d8cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydash \
python3.13dist-pydash \
python313-pydash \
python3dist-pydash"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
