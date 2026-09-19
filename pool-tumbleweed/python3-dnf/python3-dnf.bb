SUMMARY = "Python 3 interface to DNF"
DESCRIPTION = "This package provides the Python 3 interface to DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.23.0"

RPM_NAME = "python3-dnf-4.23.0-2.4.noarch.rpm"
RPM_HASH = "56feca9392229425e93c610dc57414c8e3c1de44215d598be0bf0f045fd4c662ac250f8ea4e0ba2da63c4c335d044bb12c8000782f13059a07e0126f761b4ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnf \
python3.13dist-dnf \
python3dist-dnf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
deltarpm \
dnf-data \
python-abi \
python3-curses \
python3-gpg \
python3-hawkey \
python3-libcomps \
python3-libmodulemd \
python3-rpm"

inherit rpm
