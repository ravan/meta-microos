SUMMARY = "An OBS service: generate KIWI description using KEG"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
The source service produces a KIWI image description through KEG from one or \
more given git repositories that contain keg-recipes source tree. It supports \
auto-generation of change log files from commit history."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "obs-service-compose_kiwi_description-2.2.1-1.3.noarch.rpm"
RPM_HASH = "f518d2d5b6e0b9f4935610d1d10257b9f6c79941dee155aa8127d77766977bde347f054a81ba9542e3cc4e6b03996c75681c0b0c5f6b8c975ff5fa42844e53b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-compose-kiwi-description"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
git \
python-kiwi-keg"

inherit rpm
