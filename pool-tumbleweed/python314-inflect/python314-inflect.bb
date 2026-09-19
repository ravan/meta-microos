SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "7.5.0"

RPM_NAME = "python314-inflect-7.5.0-1.7.noarch.rpm"
RPM_HASH = "9fad348a88c5fde667f93a6185a8d4e18cb13e6cce7d0f857b680d6a0c9c3c2c573b79d25959d380ccfb3db283d4a57bf6a695be9cc28a6fe1449891131cca56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-inflect \
python314-inflect \
python3dist-inflect"

RDEPENDS:${PN} += "python-abi \
python314-more-itertools \
python314-typeguard"

inherit rpm
