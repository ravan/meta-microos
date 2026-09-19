SUMMARY = "A caching front-end based on the Dogpile lock"
DESCRIPTION = "A caching API built around the concept of a 'dogpile lock', which allows \
continued access to an expiring data value while a single thread generates a \
new value."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python313-dogpile.cache-1.5.0-1.3.noarch.rpm"
RPM_HASH = "dfcc61924eb219b22ea64854a85a97da6b8dd0968e8fc1c92768df057b93f5c940e257ada0e3e5d8ca983cd985dd79bafd139f0db8c56a681e7a0c02743febc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogpile.cache \
python3-dogpile.core \
python3.13dist-dogpile.cache \
python313-dogpile.cache \
python313-dogpile.core \
python3dist-dogpile.cache"

RDEPENDS:${PN} += "python-abi \
python313-decorator \
python313-stevedore"

inherit rpm
