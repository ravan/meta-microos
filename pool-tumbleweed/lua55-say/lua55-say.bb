SUMMARY = "Lua string hashing library, useful for internationalization"
DESCRIPTION = "Useful for internationalization."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "lua55-say-1.4.1-3.2.noarch.rpm"
RPM_HASH = "bdbc0f1d412d7a35ebfeb1d8f76153303224025cc8ce6cd32ac03634214b9579f36a7d71cbaf52f604dda9da30f008d072ead0548a689522bdb626931e12543a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-say"

RDEPENDS:${PN} += "lua55"

inherit rpm
