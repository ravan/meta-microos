SUMMARY = "KIWI - host requirements for handling image descriptions better"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to handling image descriptions better. This also \
includes reading of image descriptions for different markup \
languages"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-image-validation-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "f939294881155c38f7a37e5b8551f9b23ce81b7e209f627b8a9710aef68d016edb3d8da095d5118b8d79e4453734c9bb6ba9f4d4c841be17985a9289451bb012"

RPROVIDES:${PN} += "kiwi-systemdeps-image-validation"

RDEPENDS:${PN} += "python3-solv"

inherit rpm
