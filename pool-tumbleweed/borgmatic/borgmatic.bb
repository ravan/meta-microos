SUMMARY = "Automation tool for borgbackup"
DESCRIPTION = "borgmatic is a Python wrapper script for the Borg backup software \
that initiates a backup, prunes any old backups according to a \
retention policy, and validates backups for consistency. The script \
supports specifying your settings in a declarative configuration file \
rather than having to put them all on the command-line, and handles \
common errors."
LICENSE = "GPL-3.0-only"

PV = "1.9.5"

RPM_NAME = "borgmatic-1.9.5-3.1.noarch.rpm"
RPM_HASH = "a990f3a780f8629bc8ec9eb80e0fd32c98511297f916a0df221333a85a00a5319ce1fce2ae78223ec0ed8f73e9668abe299217767bbf4dada886a92fcb1ffff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgmatic \
config-borgmatic \
python2-borgmatic \
python3.13dist-borgmatic \
python3dist-borgmatic"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
borgbackup \
python-abi \
python3-jsonschema \
python3-packaging \
python3-requests \
python3-ruamel.yaml"

inherit rpm
