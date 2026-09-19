SUMMARY = "Tool for Checking gettext POT/PO/MO Files"
DESCRIPTION = "i18nspector is a tool for checking translation templates (POT), message \
catalogues (PO) and compiled message catalogues (MO) files for common \
problems. These files are used by the GNU gettext translation functions \
and tools in many different development environments. \
 \
Checks include: incorrect or inconsistent character encoding, missing \
headers, incorrect language codes and improper plural forms."
LICENSE = "MIT"

PV = "0.27.2"

RPM_NAME = "i18nspector-0.27.2-1.2.noarch.rpm"
RPM_HASH = "94be889e183609b3f29f9a03c11927514ddaacf24ae2699d10e308e0ded0b7a04a3404f8c243f9f8dd94927c0103dc810bb5e67b699f18a37298fa31b4c69cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "i18nspector"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-polib \
python3-rply"

inherit rpm
