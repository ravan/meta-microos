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

RPM_NAME = "python314-python-iso639-2026.4.20-1.2.noarch.rpm"
RPM_HASH = "13dc3af7bb86175b80987418d526345324af9ff9cf50bbd5e173d9805649b0b70fd65e88980e8ada7754bd45d03e7f6660b08c08bb8ac7d97e547803ebee5799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-iso639 \
python314-python-iso639 \
python3dist-python-iso639"

RDEPENDS:${PN} += "python-abi"

inherit rpm
