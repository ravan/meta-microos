SUMMARY = "A modern skeleton for Sphinx themes"
DESCRIPTION = "A modern skeleton for Sphinx themes."
LICENSE = "MIT"

PV = "1.0.0.beta2"

RPM_NAME = "python314-sphinx-basic-ng-1.0.0.beta2-1.12.noarch.rpm"
RPM_HASH = "7b55fc9288e50e72dcae4773eac3c4d47f8913edc3e0670af1e5eba67721bcfdbab557eca4709088a72f01614bf8fe7ca0610929be6e882164b8273403768868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-basic-ng \
python314-sphinx-basic-ng \
python3dist-sphinx-basic-ng"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
