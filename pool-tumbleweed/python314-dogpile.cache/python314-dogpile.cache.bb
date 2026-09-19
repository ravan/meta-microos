SUMMARY = "A caching front-end based on the Dogpile lock"
DESCRIPTION = "A caching API built around the concept of a 'dogpile lock', which allows \
continued access to an expiring data value while a single thread generates a \
new value."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python314-dogpile.cache-1.5.0-1.3.noarch.rpm"
RPM_HASH = "2f0523dcc393c5e666c31563246cc0767fc0f83fa0e43cc4541f47fc52a19a978f3f7ae7afc7f9a33f482d06a240a0f2f1bb6615beed47892dce989a2a982a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dogpile.cache \
python314-dogpile.cache \
python314-dogpile.core \
python3dist-dogpile.cache"

RDEPENDS:${PN} += "python-abi \
python314-decorator \
python314-stevedore"

inherit rpm
