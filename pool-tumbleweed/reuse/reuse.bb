SUMMARY = "A tool for compliance with the REUSE recommendations"
DESCRIPTION = "A tool for compliance with the REUSE recommendations.  Essentially, \
it is a linter that checks for a project's compliance, and a compiler that \
generates a project's bill of materials."
LICENSE = "Apache-2.0 & CC-BY-SA-4.0 & GPL-3.0-or-later & CC0-1.0"

PV = "6.2.0"

RPM_NAME = "reuse-6.2.0-1.2.aarch64.rpm"
RPM_HASH = "5ef9d27173e57ff04c17d28dc0b35bfadef79083256b4dae160eb7e918a1b25fafb420b9a8517e167f66fe3e8dde466130c648c1a6ab71770bd1e02cf9cecc4c"

RPROVIDES:${PN} += "python3.13dist-reuse \
python3dist-reuse \
reuse"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Jinja2 \
python3-attrs \
python3-click \
python3-license-expression \
python3-python-debian \
python3-python-magic \
python3-tomlkit"

inherit rpm
