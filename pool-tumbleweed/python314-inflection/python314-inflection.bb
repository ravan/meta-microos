SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python314-inflection-0.5.1-4.5.noarch.rpm"
RPM_HASH = "8f269c3e905d3f2f97dfea4d3713ef552071a48973d3c73323278326e7a0d2d26e8ac6e68cb194a4fd4b673434498b9fa918b357424bac03d7babf2c2e57c98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-inflection \
python314-inflection \
python3dist-inflection"

RDEPENDS:${PN} += "python-abi"

inherit rpm
