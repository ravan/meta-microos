SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "python314-copr-cli-2.4-1.4.noarch.rpm"
RPM_HASH = "28307348a6e750888000b772e5147eeee339da08b862affa8a2cb6c9c28c6a1ec89efad1e0ca3c3eb21cc67f299a825c621b61dc7f8240ba0468a00f3cdf2e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-copr-cli \
python314-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-copr \
python314-humanize \
python314-setuptools"

inherit rpm
