SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python314-feedgenerator-2.2.1-1.6.noarch.rpm"
RPM_HASH = "62606d8a416eb5db6cea050c69848893848e148072d384d2c29c3a5de72e4878529c864e5b039f10ec941797214c29650bbee4b6d92a502be2935aa56736b6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-feedgenerator \
python314-feedgenerator \
python3dist-feedgenerator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
