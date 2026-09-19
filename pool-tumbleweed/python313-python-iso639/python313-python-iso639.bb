SUMMARY = "ISO 639 language codes, names, and other associated information"
DESCRIPTION = "python-iso639 is a Python package for ISO 639 language codes, names, and other \
associated information. \
 \
Current features: \
 \
 * A representation of languages mapped across ISO 639-1, 639-2, and 639-3. \
 * Functionality to 'guess' what a language is for a given unknown language \
   code or name."
LICENSE = "Apache-2.0"

PV = "2026.4.20"

RPM_NAME = "python313-python-iso639-2026.4.20-1.2.noarch.rpm"
RPM_HASH = "f9ae9f38fd137aa76a013e08e882ac315e9050d993fcd2302ca8281fc98e2853e6e1e126557538cd37752c590e1658be11cb45138d2d82526164f00a8dbeaf78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-iso639 \
python3.13dist-python-iso639 \
python313-python-iso639 \
python3dist-python-iso639"

RDEPENDS:${PN} += "python-abi"

inherit rpm
