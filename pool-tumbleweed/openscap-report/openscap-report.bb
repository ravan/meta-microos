SUMMARY = "A tool for generating human-readable reports from (SCAP) XCCDF and ARF results"
DESCRIPTION = "This package provides a command-line tool for generating \
human-readable reports from SCAP XCCDF and ARF results."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT & SUSE-Public-Domain"

PV = "0.2.6"

RPM_NAME = "openscap-report-0.2.6-2.5.noarch.rpm"
RPM_HASH = "49831866d84bc707e2147bc1054de064a62390b3b68594a70fea96c7a51b7ecc30bd1cb69ba62c789ec0830a2ca5982998e31b60b82bc6278a93ab6eb0eae032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-patternfly \
openscap-report \
python3.13dist-openscap-report \
python3dist-openscap-report"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-Jinja2 \
python3-lxml"

inherit rpm
