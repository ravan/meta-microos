SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python313-ufonormalizer-0.6.3-1.5.noarch.rpm"
RPM_HASH = "0f2ada4b2116aff4f8e6777439f793ccc020362cc64186eefb12570eb590401dcef6f3f8cb44d73ac51319149decc32ae539733572d63bed20d82314d9803b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufonormalizer \
python3.13dist-ufonormalizer \
python313-ufonormalizer \
python3dist-ufonormalizer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
