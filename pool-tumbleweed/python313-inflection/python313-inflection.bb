SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-inflection-0.5.1-4.5.noarch.rpm"
RPM_HASH = "7c0827e6b415a59bc8526537ed4a0b4f8d2f4af94bc44977262aabee476f700599ac9f4f5c7a18f3918203b2116b4ea6e64ddafb4c5a3f736ab487ba280efa52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inflection \
python3.13dist-inflection \
python313-inflection \
python3dist-inflection"

RDEPENDS:${PN} += "python-abi"

inherit rpm
