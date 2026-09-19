SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.3.0"

RPM_NAME = "python313-flake8-deprecated-2.3.0-1.4.noarch.rpm"
RPM_HASH = "32d8718e578d65f763b805848c06d52915f44a5ee3361fd86e5a69f00d366457c105c7f1b97fecd229c733b0f36bfe479159efd10e9aa686bf847dc211beaeb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-deprecated \
python3.13dist-flake8-deprecated \
python313-flake8-deprecated \
python3dist-flake8-deprecated"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
