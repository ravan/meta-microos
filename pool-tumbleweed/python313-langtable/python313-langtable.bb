SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.71"

RPM_NAME = "python313-langtable-0.0.71-2.1.noarch.rpm"
RPM_HASH = "2b5dba230ccce91a209cf76d1be00ec3401dddae5839e3d76634cf9ba502ba0995f8072e18d5449abe90dff6ac762bdb1fcf1fe4fc061a6ef9ef8d87bc2c9f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langtable \
python3.13dist-langtable \
python313-langtable \
python3dist-langtable"

RDEPENDS:${PN} += "python-abi \
python-langtable-data"

inherit rpm
