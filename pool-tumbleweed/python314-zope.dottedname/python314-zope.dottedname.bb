SUMMARY = "Resolver for Python dotted names"
DESCRIPTION = "Resolver for Python dotted names."
LICENSE = "ZPL-2.1"

PV = "7.1"

RPM_NAME = "python314-zope.dottedname-7.1-1.3.noarch.rpm"
RPM_HASH = "08e9d0b15a49f5f868c55fcbfa26fe418a347d470ade6252f0224364afe6d7627a35b60e525f6841cb9e6f3aba96dd26355a3bddf5782202988290460f9adb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.dottedname \
python314-zope.dottedname \
python3dist-zope.dottedname"

RDEPENDS:${PN} += "python-abi"

inherit rpm
