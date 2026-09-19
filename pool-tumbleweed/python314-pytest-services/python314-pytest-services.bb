SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python314-pytest-services-2.2.2-1.3.noarch.rpm"
RPM_HASH = "4eda2da644ecd3806901721388012db706db1dd9def2133fa05ca120b6b05df38faea8271963f9c0e46c35a614a0e7ece4a8a2bc7079fe3d3a0f29ab3c8afb7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-services \
python314-pytest-services \
python3dist-pytest-services"

RDEPENDS:${PN} += "python-abi \
python314-psutil \
python314-pytest \
python314-requests \
python314-setuptools \
python314-zc.lockfile"

inherit rpm
