SUMMARY = "Parser library for project Change Log documents"
DESCRIPTION = "changelog-chug is a parser for project Change Log documents."
LICENSE = "AGPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python313-changelog-chug-0.0.3-1.8.noarch.rpm"
RPM_HASH = "0f1f1d364395a404e116bc205edccf0d0d082c1cf40a5cd9ed01e25dc4ca5b3770a94d5638abf38c294f012c2fb16995efdd885f486846502f88c251fa3df947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-changelog-chug \
python3.13dist-changelog-chug \
python313-changelog-chug \
python3dist-changelog-chug"

RDEPENDS:${PN} += "python-abi \
python313-docutils \
python313-semver"

inherit rpm
